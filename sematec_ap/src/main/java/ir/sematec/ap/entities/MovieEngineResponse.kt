package ir.sematec.ap.entities

data class MovieEngineResponse(
        val page: Int,
        val results: List<MovieResult>,
        val total_pages: Int,
        val total_results: Int
)