module example.module.name {
    exports md.leonis to javafx.graphics;

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    requires pluggable.module;
}
