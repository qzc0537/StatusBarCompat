# StatusBarCompat
一个实现多fragment状态栏沉浸式的库

本库基于https://github.com/niorgai/StatusBarCompat

[![](https://jitpack.io/v/qzc0537/StatusBarCompat.svg)](https://jitpack.io/#qzc0537/StatusBarCompat)


使用
--
1.project build.gradle下添加：
maven { url 'https://jitpack.io' }

如下：

```
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

2.app build.gradle下添加依赖 ：

```
implementation 'com.github.qzc0537:StatusBarCompat:1.0.2'
```

3.愉快的使用：
```
                透明状态栏：
                StatusBarCompat.translucentStatusBar(mContext, true);
                设置状态栏颜色：
                StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.common_bg));
                状态栏白色背景：
                StatusBarCompat.changeToLightStatusBar(mContext);

