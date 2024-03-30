package X;

import android.content.ClipData;
import android.content.ClipDescription;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: X.0X6  reason: invalid class name */
public final class AnonymousClass0X6 {
    public final C17310r4 A00;

    public static AnonymousClass0X6 A00(ContentInfo contentInfo) {
        return new AnonymousClass0X6(new C09720cp(contentInfo));
    }

    public Pair A01(C16670pt r8) {
        Pair create;
        ClipData B9k = this.A00.B9k();
        AnonymousClass0X6 r4 = null;
        if (B9k.getItemCount() == 1) {
            AnonymousClass0X6 r0 = this;
            if (!r8.BvZ(B9k.getItemAt(0))) {
                r0 = null;
                r4 = this;
            }
            return Pair.create(r0, r4);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < B9k.getItemCount(); i++) {
            ClipData.Item itemAt = B9k.getItemAt(i);
            if (r8.BvZ(itemAt)) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0I();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = AnonymousClass001.A0I();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            create = Pair.create((Object) null, B9k);
        } else if (arrayList2 == null) {
            create = Pair.create(B9k, (Object) null);
        } else {
            ClipData clipData = new ClipData(new ClipDescription(B9k.getDescription()), (ClipData.Item) arrayList.get(0));
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                clipData.addItem((ClipData.Item) arrayList.get(i2));
            }
            ClipData clipData2 = new ClipData(new ClipDescription(B9k.getDescription()), (ClipData.Item) arrayList2.get(0));
            for (int i3 = 1; i3 < arrayList2.size(); i3++) {
                clipData2.addItem((ClipData.Item) arrayList2.get(i3));
            }
            create = Pair.create(clipData, clipData2);
        }
        if (create.first == null) {
            return Pair.create((Object) null, this);
        }
        if (create.second == null) {
            return Pair.create(this, (Object) null);
        }
        C17280r1 r02 = new AnonymousClass0WI(this).A00;
        r02.BqR((ClipData) create.first);
        AnonymousClass0X6 B20 = r02.B20();
        C17280r1 r03 = new AnonymousClass0WI(this).A00;
        r03.BqR((ClipData) create.second);
        return Pair.create(B20, r03.B20());
    }

    public ContentInfo A02() {
        ContentInfo BJJ = this.A00.BJJ();
        Objects.requireNonNull(BJJ);
        return BJJ;
    }

    public String toString() {
        return this.A00.toString();
    }

    public AnonymousClass0X6(C17310r4 r1) {
        this.A00 = r1;
    }
}
