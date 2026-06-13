package io.legado.app.data.entities

data class NavigationBarConfig(
    var name: String,
    var isNightMode: Boolean,
    var layoutMode: LayoutMode = LayoutMode.FIXED,
    var materialMode: MaterialMode = MaterialMode.SOLID,
    var opacity: Int = 100,
    var borderColor: Int = 0x72E7EEF5.toInt(),
    var borderOpacity: Int = 100
)

enum class LayoutMode {
    FIXED,
    FLOATING;

    val displayName: String
        get() = when (this) {
            FIXED -> "固定"
            FLOATING -> "悬浮"
        }
}

enum class MaterialMode {
    SOLID,
    GLASS,
    FROSTED;

    val displayName: String
        get() = when (this) {
            SOLID -> "实心"
            GLASS -> "玻璃"
            FROSTED -> "磨砂"
        }
}