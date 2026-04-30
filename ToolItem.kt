// ToolItem.kt

// DuckDuckGo Search Implementation
class DuckDuckGoSearch : SearchTool() {
    // Replace brave_search with duckduckgo_search
    val searchTool = duckduckgo_search 

    // Update displayName and description
    override val displayName = "DuckDuckGo Search"
    override val description = "Search the web with DuckDuckGo's free API. No API key required."

    // Removed find_nearby_places
}