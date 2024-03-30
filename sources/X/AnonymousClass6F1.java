package X;

import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6F1  reason: invalid class name */
public class AnonymousClass6F1 {
    public final AnonymousClass6F3 A00;
    public final File A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6F1 r5 = (AnonymousClass6F1) obj;
            File file = this.A01;
            File file2 = r5.A01;
            return (file == file2 || AnonymousClass00C.A0J(file, file2)) && this.A00.equals(r5.A00);
        }
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A01;
        objArr[1] = null;
        objArr[2] = this.A00;
        objArr[3] = -1L;
        objArr[4] = -1L;
        C36371kC.A1S(objArr, -1);
        return Arrays.hashCode(objArr);
    }

    public boolean A01() {
        return AnonymousClass000.A1P(C109715Yq.A00(this.A01.getPath(), "video/mp4").contains("image") ? 1 : 0);
    }

    public AnonymousClass6F1(C118665oX r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public JSONObject A00() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("mSourceFile", this.A01.getPath());
        A1B.put("mSourceTimeRange", this.A00.A00());
        A1B.put("mPhotoDurationUs", -1);
        A1B.put("mMediaOriginalDurationMs", -1);
        A1B.put("mOutputFps", -1);
        return A1B;
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
