package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: X.1k0  reason: invalid class name and case insensitive filesystem */
public class C36251k0 implements AnonymousClass004 {
    public Object A00;
    public final int A01;

    public C36251k0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        switch (this.A01) {
            case 0:
                return ((AbstractAppShellDelegate) this.A00).m2lambda$onCreate$4$comwhatsappAbstractAppShellDelegate();
            case 1:
                return ((C33571fa) this.A00).A0C;
            case 2:
                return AnonymousClass179.A00((AnonymousClass179) this.A00);
            case 3:
                AnonymousClass1KW r1 = (AnonymousClass1KW) this.A00;
                AnonymousClass00C.A0D(r1, 0);
                return r1.A01.A00("extensions_prefs");
            case 4:
                return ((C19890wg) this.A00).A00(C19420v0.A05);
            case 5:
                C18830tt r4 = ((C18800tq) C18810tr.A00(((C19630wG) this.A00).A00, C18800tq.class)).AfI.A00;
                C227315o builderWithExpectedSize = C20760y7.builderWithExpectedSize(2);
                C18800tq.Av3();
                builderWithExpectedSize.addAll(C18830tt.AEk(C18830tt.A52(r4), C18830tt.A55(r4)));
                builderWithExpectedSize.add((Object) new C23911Ai((C20650xu) r4.ADO.A3Z.get(), (C227615r) r4.A1I.get()));
                return builderWithExpectedSize.build();
            case 6:
                return new PorterDuffColorFilter(((C19630wG) this.A00).A00.getResources().getColor(R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
            case 9:
                return new C104675As((AnonymousClass6S5) ((AnonymousClass005) this.A00).get());
            case 10:
                C25421Gg r0 = (C25421Gg) this.A00;
                return r0.A00.B4z(r0.A01, new LinkedBlockingQueue(), 0, 1, 1, 60);
            case 11:
                C25441Gi r12 = (C25441Gi) this.A00;
                AnonymousClass00C.A0D(r12, 0);
                return r12.A00.B4z("DocumentCheckQueue", new LinkedBlockingQueue(), 1, 1, 1, 0);
            case 12:
                C50342kb B4z = ((C19770wU) this.A00).B4z("FileDownloadQueue", new LinkedBlockingQueue(), 1, 1, 10, 5);
                B4z.allowCoreThreadTimeOut(true);
                return B4z;
            case 13:
                C50342kb B4z2 = ((C19770wU) this.A00).B4z("MediaDownload", new PriorityBlockingQueue(), 1, 1, 10, 60);
                B4z2.allowCoreThreadTimeOut(true);
                return B4z2;
            case 14:
                C50342kb B4z3 = ((C19770wU) this.A00).B4z("ThumbnailDownloadQueue", new LinkedBlockingQueue(), 1, 2, 10, 5);
                B4z3.allowCoreThreadTimeOut(true);
                return B4z3;
            case 15:
                C50342kb B4z4 = ((C19770wU) this.A00).B4z("MediaUploadQueue", new LinkedBlockingQueue(), 10, 10, 1, 5);
                B4z4.allowCoreThreadTimeOut(true);
                return B4z4;
            case 16:
                Log.i("externalfilevalidator/initializing allowlist lazily");
                C20690y0 r42 = (C20690y0) ((C24051Aw) this.A00).A01.get();
                HashSet hashSet = new HashSet();
                hashSet.add(r42.A0G());
                hashSet.add(r42.A0B());
                hashSet.add(r42.A0A());
                hashSet.add(r42.A0D());
                hashSet.add(r42.A0U("personal"));
                hashSet.add(r42.A0U("business"));
                hashSet.add(r42.A0C());
                File file = r42.A08().A09;
                C20690y0.A07(file, false);
                hashSet.add(file);
                Context context = r42.A01.A00;
                File file2 = new File(context.getFilesDir(), "Gifs");
                C20690y0.A07(file2, false);
                hashSet.add(file2);
                File file3 = new File(context.getCacheDir(), "stickers_cache");
                C20690y0.A07(file3, false);
                hashSet.add(file3);
                hashSet.add(r42.A08().A08);
                hashSet.add(r42.A08().A06);
                hashSet.add(r42.A08().A07);
                if (r42.A00 != null && C19550w8.A07()) {
                    if (C20800yB.A01(C21000yV.A02, r42.A02, 7735)) {
                        AnonymousClass3LP.A01(r42.A00, hashSet);
                    }
                }
                return Collections.unmodifiableSet(hashSet);
            case 17:
                return AnonymousClass6VR.A00((Context) this.A00);
            default:
                return ((AnonymousClass005) this.A00).get();
        }
    }
}
