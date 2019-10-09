package bar.status.com.statusbardemo.base;

/**
 * 一般的Activity中要用到View操作无非是显示/隐藏加载框、
 * 显示出错信息、显示当数据为空的时候的view
 */
public interface BaseView {
    void showError(String msg);
    void useNightMode(boolean isNight);
}