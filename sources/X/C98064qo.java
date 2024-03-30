package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.AbstractCollection;
import java.util.ArrayList;

/* renamed from: X.4qo  reason: invalid class name and case insensitive filesystem */
public class C98064qo extends MarkerEditor implements PointEditor {
    public final ArrayList A00 = AnonymousClass001.A0I();
    public final C140306lN A01;

    public static void A00(C98064qo r1, Object obj) {
        r1.A00.add(new AnonymousClass6JF(obj));
    }

    public static void A01(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass6JF(obj));
    }

    public void markerEditingCompleted() {
        C140306lN.A00(this.A01, this, (Object) null);
    }

    public PointEditor pointCustomTimestamp(long j) {
        A01((Object) null, this.A00);
        return this;
    }

    public MarkerEditor pointEditingCompleted() {
        A01((Object) null, this.A00);
        return this;
    }

    public PointEditor pointEditor(String str) {
        ArrayList arrayList = this.A00;
        SystemClock.uptimeMillis();
        A01((Object) null, arrayList);
        return this;
    }

    public PointEditor pointShouldIncludeMetadata(boolean z) {
        A01(Boolean.valueOf(z), this.A00);
        return this;
    }

    public MarkerEditor withLevel(int i) {
        A01(Integer.valueOf(i), this.A00);
        return this;
    }

    public C98064qo(C140306lN r2) {
        this.A01 = r2;
    }

    public MarkerEditor point(String str, String str2, long j) {
        A00(this, str2);
        return this;
    }

    public MarkerEditor pointWithMetadata(String str, String str2, long j) {
        A00(this, str2);
        return this;
    }

    public PointEditor addPointData(String str, double d) {
        A01(Double.valueOf(d), this.A00);
        return this;
    }

    public PointEditor addPointData(String str, float f) {
        A01(Float.valueOf(f), this.A00);
        return this;
    }

    public PointEditor addPointData(String str, int i) {
        A01(Integer.valueOf(i), this.A00);
        return this;
    }

    public PointEditor addPointData(String str, long j) {
        A01(Long.valueOf(j), this.A00);
        return this;
    }

    public PointEditor addPointData(String str, String str2) {
        A00(this, str2);
        return this;
    }

    public PointEditor addPointData(String str, boolean z) {
        A01(Boolean.valueOf(z), this.A00);
        return this;
    }

    public PointEditor addPointData(String str, double[] dArr) {
        A00(this, dArr);
        return this;
    }

    public PointEditor addPointData(String str, float[] fArr) {
        A00(this, fArr);
        return this;
    }

    public PointEditor addPointData(String str, int[] iArr) {
        A00(this, iArr);
        return this;
    }

    public PointEditor addPointData(String str, long[] jArr) {
        A00(this, jArr);
        return this;
    }

    public PointEditor addPointData(String str, String[] strArr) {
        A00(this, strArr);
        return this;
    }

    public PointEditor addPointData(String str, boolean[] zArr) {
        A00(this, zArr);
        return this;
    }

    public MarkerEditor annotate(String str, double d) {
        A01(Double.valueOf(d), this.A00);
        return this;
    }

    public MarkerEditor annotate(String str, int i) {
        A01(Integer.valueOf(i), this.A00);
        return this;
    }

    public MarkerEditor annotate(String str, long j) {
        A01(Long.valueOf(j), this.A00);
        return this;
    }

    public MarkerEditor annotate(String str, String str2) {
        A00(this, str2);
        return this;
    }

    public MarkerEditor annotate(String str, boolean z) {
        A01(Boolean.valueOf(z), this.A00);
        return this;
    }

    public MarkerEditor annotate(String str, double[] dArr) {
        A00(this, dArr);
        return this;
    }

    public MarkerEditor annotate(String str, int[] iArr) {
        A00(this, iArr);
        return this;
    }

    public MarkerEditor annotate(String str, long[] jArr) {
        A00(this, jArr);
        return this;
    }

    public MarkerEditor annotate(String str, String[] strArr) {
        A00(this, strArr);
        return this;
    }

    public MarkerEditor annotate(String str, boolean[] zArr) {
        A00(this, zArr);
        return this;
    }
}
