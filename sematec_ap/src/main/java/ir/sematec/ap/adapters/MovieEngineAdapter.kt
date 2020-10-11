package ir.sematec.ap.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import ir.sematec.ap.entities.MovieResult
import ir.sematec.ap.R
import ir.sematec.ap.utils.load

class MovieEngineAdapter(val context: Context, val items: MutableList<MovieResult>) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): MovieResult {
        return items.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val view: View =
            LayoutInflater.from(context).inflate(
                R.layout.movie_engine_results_item,
                p2, false
            )

        val tags = view.findViewById<TextView>(R.id.tags)
        val image = view.findViewById<ImageView>(R.id.image)

        tags.text = getItem(position).title
        image.load(context, getItem(position).poster_path)

        return view
    }
}