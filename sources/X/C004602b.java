package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.whatsapp.R;

/* renamed from: X.02b  reason: invalid class name and case insensitive filesystem */
public class C004602b extends ContextWrapper {
    public int A00;
    public Configuration A01;
    public Resources A02;
    public Resources.Theme A03;
    public LayoutInflater A04;

    private void A00() {
        if (this.A03 == null) {
            this.A03 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.A03.setTo(theme);
            }
        }
        this.A03.applyStyle(this.A00, true);
    }

    public void A01(Configuration configuration) {
        if (this.A02 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.A01 == null) {
            this.A01 = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public Resources getResources() {
        Resources resources = this.A02;
        if (resources == null) {
            Configuration configuration = this.A01;
            if (configuration == null) {
                resources = super.getResources();
            } else {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.A02 = resources;
        }
        return resources;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A04 = cloneInContext;
        return cloneInContext;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.A03;
        if (theme != null) {
            return theme;
        }
        if (this.A00 == 0) {
            this.A00 = R.style.f13nameremoved;
        }
        A00();
        return this.A03;
    }

    public void setTheme(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }

    public C004602b(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public C004602b(Context context, Resources.Theme theme) {
        super(context);
        this.A03 = theme;
    }

    public C004602b() {
        super((Context) null);
    }
}
