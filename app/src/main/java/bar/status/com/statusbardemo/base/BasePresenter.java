package bar.status.com.statusbardemo.base;

/**
 * MVP框架的简单封装 P处理层
 */
public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}