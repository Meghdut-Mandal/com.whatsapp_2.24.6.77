package X;

import android.net.Uri;
import android.util.Log;
import com.facebook.exoplayer.monitor.VpsEventCallback;

/* renamed from: X.9YW  reason: invalid class name */
public class AnonymousClass9YW {
    public AnonymousClass5SY A00;
    public final C207169uf A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public void A02() {
        VpsEventCallback vpsEventCallback;
        C207169uf r1;
        if (this instanceof AnonymousClass89G) {
            AnonymousClass89G r12 = (AnonymousClass89G) this;
            if (r12.A02.isVideoQplPipelineEnabled && (vpsEventCallback = r12.A00) != null && (r1 = r12.A01) != null) {
                vpsEventCallback.B2I(new AnonymousClass89C(r1));
            }
        }
    }

    public void A03() {
        throw AnonymousClass001.A0E("VodPrefetchTask is a base class. Please use more specific prefetch task");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9YW) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        StringBuilder A0u;
        String str = this.A03;
        C207169uf r3 = this.A01;
        if (r3 != null && r3.A0S) {
            str = AnonymousClass000.A0q("_t", AnonymousClass000.A0v(str));
        }
        if (!this.A04) {
            if (r3 == null) {
                Log.w("VodPrefetchTask", "Trying to lookup prefetch task with insufficient information");
                A0u = AnonymousClass000.A0v(str);
                A0u.append("_track_-1");
            } else {
                Uri uri = r3.A0D.A05;
                if (uri == null) {
                    A0u = AnonymousClass000.A0v(str);
                    A0u.append("_track_");
                    A0u.append(r3.A04);
                } else {
                    j = r3.A07;
                    if (j == 0) {
                        return uri.toString();
                    }
                    A0u = AnonymousClass000.A0u();
                    C36351kA.A1K(uri, A0u);
                }
            }
            return A0u.toString();
        } else if (r3 == null) {
            return str;
        } else {
            j = r3.A07;
            if (j == 0) {
                return str;
            }
            A0u = AnonymousClass000.A0v(str);
        }
        A0u.append("_");
        A0u.append(j);
        return A0u.toString();
    }

    public AnonymousClass9YW(AnonymousClass5SY r1, C207169uf r2, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A00 = r1;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
