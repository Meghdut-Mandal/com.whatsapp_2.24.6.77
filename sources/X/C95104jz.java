package X;

import com.whatsapp.AlarmService;

/* renamed from: X.4jz  reason: invalid class name and case insensitive filesystem */
public abstract class C95104jz extends C39171rR implements C18700tb {
    public boolean A00 = false;
    public final Object A01 = C36441kJ.A11();
    public volatile C31091bG A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C31091bG(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            AlarmService alarmService = (AlarmService) this;
            C31141bL r2 = (C31141bL) ((C31131bK) generatedComponent());
            alarmService.A00 = C90494aF.A0P(r2.A05);
            alarmService.A01 = C18840tu.A00(r2.A04);
        }
        super.onCreate();
    }
}
