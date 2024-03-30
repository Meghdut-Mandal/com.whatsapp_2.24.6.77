package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6jm  reason: invalid class name and case insensitive filesystem */
public class C139406jm implements C159007ic {
    public final /* synthetic */ AnonymousClass6SG A00;
    public final /* synthetic */ C139556k5 A01;
    public final /* synthetic */ C124595yT A02;
    public final /* synthetic */ C125235zX A03;
    public final /* synthetic */ C159007ic A04;
    public final /* synthetic */ AnonymousClass5YD A05;
    public final /* synthetic */ C135056c3 A06;

    public C139406jm(C139556k5 r1, C124595yT r2, C125235zX r3, C159007ic r4, AnonymousClass5YD r5, C135056c3 r6, AnonymousClass6SG r7) {
        this.A01 = r1;
        this.A06 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = r7;
    }

    public void BXI(AnonymousClass5VK r5) {
        C139556k5.A01(this.A01, this.A04, this.A06, this.A00, r5);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        AnonymousClass5oF r2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass5oE r3 = (AnonymousClass5oE) it.next();
                if (r3.A00.A01.A02 == ARAssetType.EFFECT) {
                    try {
                        String canonicalPath = r3.A01.getCanonicalPath();
                        if (canonicalPath != null) {
                            r2 = new AnonymousClass5oF(this.A06.A03, canonicalPath);
                        }
                    } catch (IOException | SecurityException e) {
                        if (C90484aE.A1P()) {
                            AnonymousClass6YR.A01.Bxi("DefaultCameraCoreEffectManager", "corrupted effect file path", e);
                        }
                    }
                }
            }
        }
        C124595yT r4 = this.A02;
        r4.A02 = r2;
        r4.A04 = true;
        if (r4.A05 && r4.A06) {
            C139556k5 r32 = this.A01;
            C135056c3 r8 = this.A06;
            AnonymousClass5YD r7 = this.A05;
            C139556k5.A00(r32, r4, this.A03, this.A04, r7, r8, AnonymousClass000.A1V(r2));
        }
    }
}
