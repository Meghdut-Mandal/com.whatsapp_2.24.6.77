package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;

/* renamed from: X.07Y  reason: invalid class name */
public class AnonymousClass07Y implements AnonymousClass07X {
    public int A00;
    public C016807f A01;
    public boolean A02 = false;
    public C016307a A03;

    public boolean B35(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B77(C016307a r2, C018707z r3) {
        return false;
    }

    public boolean B7R() {
        return false;
    }

    public void BTt(C016307a r1, boolean z) {
    }

    public boolean Bhy(AnonymousClass0FZ r2) {
        return false;
    }

    public void BqL(C16990qX r2) {
        throw null;
    }

    public void BKa(Context context, C016307a r3) {
        this.A03 = r3;
        this.A01.A0G = r3;
    }

    public void Bf3(Parcelable parcelable) {
        if (parcelable instanceof C08760bH) {
            C016807f r5 = this.A01;
            C08760bH r8 = (C08760bH) parcelable;
            int i = r8.A00;
            int size = r5.A0G.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = r5.A0G.getItem(i2);
                if (i == item.getItemId()) {
                    r5.A0A = i;
                    r5.A0B = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.A01.getContext();
            AnonymousClass0ED r52 = r8.A01;
            SparseArray sparseArray = new SparseArray(r52.size());
            int i3 = 0;
            while (i3 < r52.size()) {
                int keyAt = r52.keyAt(i3);
                C08800bL r1 = (C08800bL) r52.valueAt(i3);
                if (r1 != null) {
                    sparseArray.put(keyAt, new AnonymousClass08H(context, r1));
                    i3++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            C016807f r6 = this.A01;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                SparseArray sparseArray2 = r6.A0N;
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, sparseArray.get(keyAt2));
                }
            }
            AnonymousClass081[] r4 = r6.A0J;
            if (r4 != null) {
                for (AnonymousClass081 r2 : r4) {
                    r2.setBadge((AnonymousClass08H) r6.A0N.get(r2.getId()));
                }
            }
        }
    }

    public Parcelable Bfg() {
        C08760bH r5 = new C08760bH();
        C016807f r1 = this.A01;
        r5.A00 = r1.A0A;
        SparseArray sparseArray = r1.A0N;
        AnonymousClass0ED r3 = new AnonymousClass0ED();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            AnonymousClass08H r0 = (AnonymousClass08H) sparseArray.valueAt(i);
            if (r0 != null) {
                r3.put(keyAt, r0.A08.A04);
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        r5.A01 = r3;
        return r5;
    }

    public void Bwl(boolean z) {
        AnonymousClass081[] r0;
        C017307k r02;
        if (!this.A02) {
            C016807f r5 = this.A01;
            if (!z) {
                C016307a r1 = r5.A0G;
                if (r1 != null && (r0 = r5.A0J) != null) {
                    int size = r1.size();
                    if (size == r0.length) {
                        int i = r5.A0A;
                        for (int i2 = 0; i2 < size; i2++) {
                            MenuItem item = r5.A0G.getItem(i2);
                            if (item.isChecked()) {
                                r5.A0A = item.getItemId();
                                r5.A0B = i2;
                            }
                        }
                        if (!(i == r5.A0A || (r02 = r5.A0O) == null)) {
                            C018607y.A02(r5, r02);
                        }
                        int i3 = r5.A09;
                        int size2 = r5.A0G.A04().size();
                        boolean z2 = true;
                        if (i3 != -1 ? i3 != 0 : size2 <= 3) {
                            z2 = false;
                        }
                        for (int i4 = 0; i4 < size; i4++) {
                            r5.A0H.A02 = true;
                            r5.A0J[i4].setLabelVisibilityMode(r5.A09);
                            r5.A0J[i4].setShifting(z2);
                            r5.A0J[i4].BKf((C018707z) r5.A0G.getItem(i4), 0);
                            r5.A0H.A02 = false;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            r5.A02();
        }
    }

    public int getId() {
        return this.A00;
    }
}
