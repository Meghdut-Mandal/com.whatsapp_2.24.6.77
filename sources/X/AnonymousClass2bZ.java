package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2bZ  reason: invalid class name */
public class AnonymousClass2bZ extends AnonymousClass3T1 implements C23043B1o, AnonymousClass4RU, AnonymousClass4RV {
    public C207219uk A00;
    public final C63503Kh A01 = A0U(R.id.lazy_field_carousel_cards);

    public AnonymousClass3T1 B31(C64933Qa r14, long j) {
        C207219uk A002;
        C64933Qa r2 = r14;
        AnonymousClass00C.A0D(r14, 0);
        long j2 = j;
        if (AnonymousClass000.A1S(this.A0A & 2097152, 2097152)) {
            A002 = A00();
        } else if (!C203369nr.A07(this)) {
            return new AnonymousClass2bZ(r14, this, j, false);
        } else {
            A002 = A00();
            if (A002 != null) {
                A002.A0A = null;
                C207089uX r0 = A002.A04;
                if (r0 != null) {
                    r0.A03.clear();
                }
            }
        }
        return new AnonymousClass2bZ(r2, A002, this, j2, false);
    }

    public AnonymousClass3T1 B32(C64933Qa r12) {
        C64933Qa r2 = r12;
        AnonymousClass00C.A0D(r12, 0);
        if (AnonymousClass000.A1S(this.A0A & 2097152, 2097152)) {
            return new AnonymousClass2bZ(r2, A00(), this, this.A0I, true);
        }
        return new AnonymousClass2bZ(r12, this, this.A0I, true);
    }

    private final C207219uk A00() {
        C207219uk r2 = this.A00;
        if (r2 == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        AnonymousClass00C.A08(obtain);
        obtain.writeParcelable(r2, 0);
        obtain.setDataPosition(0);
        Parcelable A0H = C36411kG.A0H(obtain, C207219uk.class);
        obtain.recycle();
        return (C207219uk) A0H;
    }

    public static final void A01(AnonymousClass2bZ r2) {
        byte[] A06;
        C207219uk r1 = r2.A00;
        if (r1 == null || (A06 = r1.A06()) == null) {
            r2.A1C((byte[]) null);
        } else {
            r2.A1D(A06, true);
        }
    }

    public final List A1X() {
        return (List) this.A01.A00;
    }

    public final void A1Y(List list) {
        C63503Kh r0 = this.A01;
        r0.A01(list);
        List list2 = (List) r0.A00;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(it);
                if (A0l instanceof AnonymousClass4TW) {
                    ((AnonymousClass4TW) A0l).BqQ(this);
                }
            }
        }
    }

    public void BqZ(C207219uk r1) {
        this.A00 = r1;
        A01(this);
    }

    public AnonymousClass2bZ(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public C207219uk BA8() {
        return this.A00;
    }

    public AnonymousClass2bZ(C64933Qa r8, C207219uk r9, AnonymousClass2bZ r10, long j, boolean z) {
        super(r10, r8, j, z);
        this.A00 = r9;
        A01(this);
    }

    public AnonymousClass2bZ(C64933Qa r8, AnonymousClass2bZ r9, long j, boolean z) {
        super(r9, r8, j, z);
        this.A00 = r9.A00;
        A01(this);
    }
}
