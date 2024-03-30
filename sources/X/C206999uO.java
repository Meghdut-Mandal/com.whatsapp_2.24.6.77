package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.9uO  reason: invalid class name and case insensitive filesystem */
public final class C206999uO implements Parcelable {
    public static final C206999uO A05 = new C206999uO((TreeMap) null, (TreeMap) null);
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(36);
    public final TreeMap A00;
    public final TreeMap A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;

    public C206999uO(TreeMap treeMap, TreeMap treeMap2) {
        this.A04 = treeMap;
        this.A00 = treeMap2;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public int describeContents() {
        return 0;
    }

    public int A00(String str, int i) {
        Number A10;
        TreeMap treeMap = this.A04;
        if (treeMap == null || (A10 = C36441kJ.A10(str, treeMap)) == null) {
            return i;
        }
        return A10.intValue();
    }

    public void writeToParcel(Parcel parcel, int i) {
        TreeMap treeMap = this.A04;
        TreeMap treeMap2 = this.A00;
        TreeMap treeMap3 = this.A01;
        TreeMap treeMap4 = this.A02;
        TreeMap treeMap5 = this.A03;
        Bundle A07 = AnonymousClass001.A07();
        if (treeMap != null) {
            Iterator A10 = C36371kC.A10(treeMap);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                A07.putInt(C90494aF.A0f(A11), C90484aE.A0G(A11));
            }
        }
        parcel.writeBundle(A07);
        Bundle A072 = AnonymousClass001.A07();
        if (treeMap2 != null) {
            Iterator A102 = C36371kC.A10(treeMap2);
            while (A102.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A102);
                A072.putBoolean(C90494aF.A0f(A112), AnonymousClass000.A1X(A112.getValue()));
            }
        }
        parcel.writeBundle(A072);
        Bundle A073 = AnonymousClass001.A07();
        if (treeMap3 != null) {
            Iterator A103 = C36371kC.A10(treeMap3);
            while (A103.hasNext()) {
                Map.Entry A113 = AnonymousClass000.A11(A103);
                A073.putIntArray(C90494aF.A0f(A113), (int[]) A113.getValue());
            }
        }
        parcel.writeBundle(A073);
        Bundle A074 = AnonymousClass001.A07();
        if (treeMap4 != null) {
            Iterator A104 = C36371kC.A10(treeMap4);
            while (A104.hasNext()) {
                Map.Entry A114 = AnonymousClass000.A11(A104);
                A074.putStringArrayList(C90494aF.A0f(A114), (ArrayList) A114.getValue());
            }
        }
        parcel.writeBundle(A074);
        Bundle A075 = AnonymousClass001.A07();
        if (treeMap5 != null) {
            Iterator A105 = C36371kC.A10(treeMap5);
            while (A105.hasNext()) {
                Map.Entry A115 = AnonymousClass000.A11(A105);
                A075.putCharArray(C90494aF.A0f(A115), C90514aH.A10(A115).toCharArray());
            }
        }
        parcel.writeBundle(A075);
    }

    public C206999uO(Parcel parcel) {
        Class<?> cls = getClass();
        Bundle A0I = C165607th.A0I(parcel, cls);
        Set<String> keySet = A0I.keySet();
        if (!keySet.isEmpty()) {
            this.A04 = new TreeMap();
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                C36341k9.A1K(A0C, this.A04, A0I.getInt(A0C));
            }
        } else {
            this.A04 = null;
        }
        Bundle A0I2 = C165607th.A0I(parcel, cls);
        Set<String> keySet2 = A0I2.keySet();
        if (!keySet2.isEmpty()) {
            this.A00 = new TreeMap();
            Iterator<String> it2 = keySet2.iterator();
            while (it2.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(it2);
                this.A00.put(A0C2, Boolean.valueOf(A0I2.getBoolean(A0C2)));
            }
        } else {
            this.A00 = null;
        }
        Bundle A0I3 = C165607th.A0I(parcel, cls);
        Set<String> keySet3 = A0I3.keySet();
        if (!keySet3.isEmpty()) {
            this.A01 = new TreeMap();
            Iterator<String> it3 = keySet3.iterator();
            while (it3.hasNext()) {
                String A0C3 = AnonymousClass001.A0C(it3);
                this.A01.put(A0C3, A0I3.getIntArray(A0C3));
            }
        } else {
            this.A01 = null;
        }
        Bundle A0I4 = C165607th.A0I(parcel, cls);
        Set<String> keySet4 = A0I4.keySet();
        if (!keySet4.isEmpty()) {
            this.A02 = new TreeMap();
            Iterator<String> it4 = keySet4.iterator();
            while (it4.hasNext()) {
                String A0C4 = AnonymousClass001.A0C(it4);
                this.A02.put(A0C4, A0I4.getStringArrayList(A0C4));
            }
        } else {
            this.A02 = null;
        }
        Bundle A0I5 = C165607th.A0I(parcel, cls);
        Set<String> keySet5 = A0I5.keySet();
        if (!keySet5.isEmpty()) {
            this.A03 = new TreeMap();
            Iterator<String> it5 = keySet5.iterator();
            while (it5.hasNext()) {
                String A0C5 = AnonymousClass001.A0C(it5);
                this.A03.put(A0C5, new String(A0I5.getCharArray(A0C5)));
            }
            return;
        }
        this.A03 = null;
    }
}
