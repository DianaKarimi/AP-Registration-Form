package ir.sematec.ap.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.TextHttpResponseHandler
import cz.msebera.android.httpclient.Header
import ir.sematec.ap.adapters.MovieEngineAdapter
import ir.sematec.ap.entities.MovieEngineResponse
import ir.sematec.ap.entities.MovieResult
import ir.sematec.ap.R
import ir.sematec.ap.utils.log
import ir.sematec.ap.utils.toast
import kotlinx.android.synthetic.main.activity_movie_search_engine.*

class MovieSearchEngineActivity : AppCompatActivity() {
    val url = "https://api.themoviedb.org/3/search/movie?api_key=15d2ea6d0dc1d476efbca3eba2b9bbfb&query="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search_engine)

        search.setOnClickListener {
            searchMovie(movie_name.text.toString())
        }
    }

    private fun searchMovie(title: String) {

        val client = AsyncHttpClient()
        val restURL = "$url$title"
        restURL.log("imdb_result")


        client.get(restURL, object : TextHttpResponseHandler() {
            override fun onSuccess(
                    statusCode: Int,
                    headers: Array<out Header>?,
                    responseString: String?
            ) {
                parseResult(responseString)
                responseString?.log("imdb_result")
            }

            override fun onFailure(
                    statusCode: Int,
                    headers: Array<out Header>?,
                    responseString: String?,
                    throwable: Throwable?
            ) {

            }

        })

    }

    private fun parseResult(serverResults: String?) {
        val gson = Gson()
        val movieEngineResp = gson.fromJson(
                serverResults,
                MovieEngineResponse::class.java
        )

        if (movieEngineResp.results.isEmpty()) {
            "No results from server".toast()
            return
        } else {
            "${movieEngineResp.results.size} results has been found".toast()
            val images = movieEngineResp.results.take(30)

            val adapter = MovieEngineAdapter(this, images as MutableList<MovieResult>)
            results.adapter = adapter
        }

    }
}