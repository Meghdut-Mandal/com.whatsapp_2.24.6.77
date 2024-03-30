package X;

import android.graphics.Rect;
import android.util.Log;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9l1  reason: invalid class name and case insensitive filesystem */
public final class C202089l1 {
    public static final C201029if A01 = new C201029if();
    public final Integer A00;

    public final AnonymousClass9V8 A01(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        Object obj;
        C198609dr r3;
        C198599dq r2;
        List list;
        if (sidecarWindowLayoutInfo == null) {
            list = C023409w.A00;
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            C201029if r8 = A01;
            C201029if.A01(sidecarDeviceState2, r8.A02(sidecarDeviceState));
            List<SidecarDisplayFeature> A002 = C201029if.A00(sidecarWindowLayoutInfo);
            AnonymousClass00C.A0D(A002, 0);
            ArrayList A0I = AnonymousClass001.A0I();
            for (SidecarDisplayFeature sidecarDisplayFeature : A002) {
                AnonymousClass00C.A0D(sidecarDisplayFeature, 0);
                Integer num = this.A00;
                C208079xc r0 = C208079xc.A00;
                AnonymousClass00C.A0D(num, 2);
                AnonymousClass00C.A0D(r0, 3);
                AnonymousClass9T4 A003 = new AnonymousClass80V(r0, num, sidecarDisplayFeature).A00("Type must be either TYPE_FOLD or TYPE_HINGE", C22500Ani.A00).A00("Feature bounds must not be 0", C22501Anj.A00).A00("TYPE_FOLD must have 0 area", C22502Ank.A00).A00("Feature be pinned to either left or top", C22503Anl.A00);
                if (A003 instanceof AnonymousClass80V) {
                    obj = ((AnonymousClass80V) A003).A02;
                } else {
                    AnonymousClass80W r1 = (AnonymousClass80W) A003;
                    int intValue = r1.A01.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            String A0l = AnonymousClass000.A0l(r1.A02, " value: ", AnonymousClass000.A0v(r1.A03));
                            AnonymousClass00C.A0D(A0l, 1);
                            Log.d("SidecarAdapter", A0l);
                        } else if (intValue != 2) {
                            throw C36441kJ.A18();
                        }
                        obj = null;
                    } else {
                        throw r1.A00;
                    }
                }
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                if (sidecarDisplayFeature2 != null) {
                    int type = sidecarDisplayFeature2.getType();
                    if (type == 1) {
                        r3 = C198609dr.A01;
                    } else if (type == 2) {
                        r3 = C198609dr.A02;
                    }
                    int A02 = r8.A02(sidecarDeviceState2);
                    if (!(A02 == 0 || A02 == 1)) {
                        if (A02 == 2) {
                            r2 = C198599dq.A02;
                        } else if (A02 == 3) {
                            r2 = C198599dq.A01;
                        }
                        Rect rect = sidecarDisplayFeature.getRect();
                        AnonymousClass00C.A08(rect);
                        A0I.add(new C208149xj(new AnonymousClass1R6(rect), r2, r3));
                    }
                }
            }
            list = A0I;
        }
        return new AnonymousClass9V8(list);
    }

    public C202089l1(Integer num) {
        this.A00 = num;
    }

    public static final boolean A00(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (AnonymousClass00C.A0J(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        C201029if r0 = A01;
        if (r0.A02(sidecarDeviceState) != r0.A02(sidecarDeviceState2)) {
            return false;
        }
        return true;
    }

    public final boolean A02(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (AnonymousClass00C.A0J(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        List A002 = C201029if.A00(sidecarWindowLayoutInfo);
        List A003 = C201029if.A00(sidecarWindowLayoutInfo2);
        if (A002 == A003) {
            return true;
        }
        if (!(A002 == null || A003 == null || A002.size() != A003.size())) {
            int size = A002.size();
            int i = 0;
            while (i < size) {
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) A002.get(i);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A003.get(i);
                if (AnonymousClass00C.A0J(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && AnonymousClass00C.A0J(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public C202089l1() {
        this(C023109s.A0C);
    }
}
