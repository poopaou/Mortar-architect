package mortarnav.commons.view;

import android.content.Context;
import android.util.AttributeSet;

import mortar.ViewPresenter;
import mortarnav.NavigationScope;
import mortarnav.NavigationScopeFactory;

/**
 * @author Lukasz Piliszczuk - lukasz.pili@gmail.com
 */
public abstract class MvpContainerFrameLayout<T extends ViewPresenter> extends MvpFrameLayout<T> {

    public MvpContainerFrameLayout(Context context) {
        super(context);
        init(context);
    }

    public MvpContainerFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MvpContainerFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    protected void init(Context context) {
        super.init(context);

        Context newContext = NavigationScopeFactory.createContext(context, getScope());
        initWithContext(newContext);
    }

    public abstract NavigationScope getScope();

    public abstract void initWithContext(Context context);
}
