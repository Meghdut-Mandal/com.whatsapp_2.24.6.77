package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4fb  reason: invalid class name and case insensitive filesystem */
public class C93084fb extends LinearLayout implements C18700tb {
    public View A00;
    public View A01;
    public Button A02;
    public ImageView A03;
    public TextView A04;
    public AnonymousClass1QZ A05;
    public boolean A06;

    public void setAlertType(int i) {
        Context context;
        int i2;
        Context context2;
        int i3;
        Resources resources;
        int i4;
        String string;
        if (i != 0) {
            if (i == 2) {
                setAlertButtonVisibility(8);
                setAlertMessageText(getContext().getString(R.string.f12nameremoved));
                resources = getResources();
                i4 = R.drawable.ic_settings_info;
            } else if (i != 3) {
                if (i != 4) {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getContext().getString(R.string.f12nameremoved));
                    string = getContext().getString(R.string.f12nameremoved);
                } else {
                    setAlertButtonVisibility(0);
                    setAlertButtonText(getResources().getString(R.string.f12nameremoved));
                    string = getResources().getString(R.string.f12nameremoved);
                }
                setAlertMessageText(string);
                resources = getResources();
                i4 = R.drawable.ic_settings_secure;
            } else {
                setAlertButtonVisibility(0);
                setAlertButtonText(getContext().getString(R.string.f12nameremoved));
                context = getContext();
                i2 = R.string.f12nameremoved;
                setAlertMessageText(context.getString(i2));
                setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
                context2 = getContext();
                i3 = R.color.f6nameremoved;
            }
            setAlertIcon(resources.getDrawable(i4));
            context2 = getContext();
            i3 = R.color.f6nameremoved;
        } else {
            setAlertButtonVisibility(0);
            setAlertButtonText(getContext().getString(R.string.f12nameremoved));
            context = getContext();
            i2 = R.string.f12nameremoved;
            setAlertMessageText(context.getString(i2));
            setAlertIcon(getResources().getDrawable(R.drawable.ic_settings_warning));
            context2 = getContext();
            i3 = R.color.f6nameremoved;
        }
        setAlertIconTint(AnonymousClass00F.A00(context2, i3));
    }

    private void setAlertIcon(Drawable drawable) {
        this.A03.setImageDrawable(drawable);
    }

    private void setAlertIconTint(int i) {
        AnonymousClass3UF.A0E(this.A03, i);
    }

    private void setAlertMessageText(String str) {
        this.A04.setText(str);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlertButtonClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setAlertButtonText(String str) {
        this.A02.setText(str);
    }

    public void setAlertButtonVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setTopDividerVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public C93084fb(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A02 = (Button) findViewById(R.id.card_details_alert_button);
        this.A04 = C36391kE.A0P(this, R.id.card_details_alert_message);
        this.A03 = C36391kE.A0N(this, R.id.card_details_alert_icon);
        this.A00 = findViewById(R.id.card_details_alert_icon_container);
        this.A01 = findViewById(R.id.card_details_alert_divider);
        setAlertType(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        setAlertMessageText(r1.getString(r0));
        setAlertIcon(getResources().getDrawable(com.whatsapp.R.drawable.ic_fbpay_error));
        r1 = getContext();
        r0 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        setAlertMessageText(getContext().getString(com.whatsapp.R.string.f12nameremoved));
        setAlertIcon(getResources().getDrawable(com.whatsapp.R.drawable.ic_settings_secure));
        r1 = getContext();
        r0 = com.whatsapp.R.color.f6nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        setAlertIconTint(X.AnonymousClass00F.A00(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAlertType(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0052;
                case -591252731: goto L_0x0042;
                case 1124965819: goto L_0x0032;
                default: goto L_0x0007;
            }
        L_0x0007:
            android.content.Context r1 = r2.getContext()
            r0 = 2131895598(0x7f12252e, float:1.9426034E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232761(0x7f0807f9, float:1.808164E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131101902(0x7f0608ce, float:1.7816227E38)
        L_0x002a:
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            r2.setAlertIconTint(r0)
            return
        L_0x0032:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131887565(0x7f1205cd, float:1.940974E38)
            goto L_0x0066
        L_0x0042:
            java.lang.String r0 = "EXPIRED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            android.content.Context r1 = r2.getContext()
            r0 = 2131892161(0x7f1217c1, float:1.9419062E38)
            goto L_0x0066
        L_0x0052:
            java.lang.String r0 = "VOIDED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0007
            r0 = 8
            r2.setAlertButtonVisibility(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131887560(0x7f1205c8, float:1.940973E38)
        L_0x0066:
            java.lang.String r0 = r1.getString(r0)
            r2.setAlertMessageText(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131232282(0x7f08061a, float:1.8080669E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setAlertIcon(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131101901(0x7f0608cd, float:1.7816225E38)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93084fb.setAlertType(java.lang.String):void");
    }
}
