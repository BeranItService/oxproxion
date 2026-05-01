package io.github.stardomains3.oxproxion

// Other imports...

val enabledSet = setOf("some_enabled_tools")

val toolItems = listOf(
    ToolItem(name = "duckduckgo_search", displayName = "DuckDuckGo Search", description = "Search the web with DuckDuckGo's free Instant Answer API. No API key required.", isEnabled = "duckduckgo_search" in enabledSet)
    // Other ToolItems...
    // Removing the old brave_search ToolItem
    // Removing the find_nearby_places ToolItem
)