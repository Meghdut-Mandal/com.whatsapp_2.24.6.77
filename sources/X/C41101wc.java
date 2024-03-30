package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1wc  reason: invalid class name and case insensitive filesystem */
public class C41101wc extends AnonymousClass0CZ implements C160717lT {
    public long A00;
    public final MediaGalleryFragmentBase A01;
    public final C20810yC A02;
    public final MediaGalleryFragmentBase A03;
    public final Map A04 = AnonymousClass001.A0J();

    public void A0K(AnonymousClass0D3 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 instanceof C41841xr) {
            AnonymousClass2Ty r1 = ((C41841xr) r3).A00;
            r1.setImageBitmap((Bitmap) null);
            r1.A06 = null;
        }
    }

    public void BSE(AnonymousClass0D3 r17, int i) {
        int i2;
        Integer num;
        int indexOf;
        AnonymousClass3K8 r5;
        AnonymousClass4O6 r52;
        AnonymousClass0D3 r8 = r17;
        AnonymousClass00C.A0D(r8, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A08;
        if (stickyHeadersRecyclerView != null) {
            i2 = stickyHeadersRecyclerView.getChildCount();
        } else {
            i2 = 0;
        }
        if (mediaGalleryFragmentBase.A00 < i2) {
            mediaGalleryFragmentBase.A00 = i2;
            StickyHeadersRecyclerView stickyHeadersRecyclerView2 = mediaGalleryFragmentBase.A08;
            if (stickyHeadersRecyclerView2 != null) {
                AnonymousClass0D1 A002 = C02900Ci.A00(stickyHeadersRecyclerView2.getRecycledViewPool(), 1);
                A002.A00 = i2;
                ArrayList arrayList = A002.A03;
                while (arrayList.size() > i2) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        if (r8 instanceof C41841xr) {
            View view = r8.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
            AnonymousClass2Ty r7 = (AnonymousClass2Ty) view;
            r7.A06 = null;
            C36411kG.A1D(r7);
            C88924Uo r0 = mediaGalleryFragmentBase.A0G;
            if (r0 != null) {
                int i3 = i;
                AnonymousClass4V2 BDy = r0.BDy(i3);
                AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.gallery.MediaItemView");
                r7.setMediaItem(BDy);
                if ((r7 instanceof AnonymousClass4O6) && (r52 = (AnonymousClass4O6) r7) != null) {
                    ((C45942Ti) r52).A07 = AnonymousClass000.A1S(mediaGalleryFragmentBase.A03, 3);
                }
                if ((r7.getTag() instanceof AnonymousClass4TB) && (r5 = mediaGalleryFragmentBase.A0K) != null) {
                    Object tag = r7.getTag();
                    AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.gallerypicker.MediaThumbLoader.BitmapLoader");
                    r5.A01((AnonymousClass4TB) tag);
                }
                if (BDy != null) {
                    C89554Wz r53 = new C89554Wz(BDy, r7, r8, this, 0);
                    r7.setTag(r53);
                    AnonymousClass4X0 r10 = new AnonymousClass4X0(r7, this, BDy, r53, 0);
                    AnonymousClass3K8 r02 = mediaGalleryFragmentBase.A0K;
                    if (r02 != null) {
                        r02.A02(r53, r10);
                    }
                    if (mediaGalleryFragmentBase instanceof MediaPickerFragment) {
                        HashSet hashSet = ((MediaPickerFragment) mediaGalleryFragmentBase).A0M;
                        Uri B7k = BDy.B7k();
                        if (C007103b.A0j(hashSet, B7k)) {
                            indexOf = C007103b.A0Y(hashSet).indexOf(B7k);
                        }
                        num = null;
                        r7.setCheckedPosition(num);
                        r7.setChecked(mediaGalleryFragmentBase.A1j(i3));
                    } else {
                        if (mediaGalleryFragmentBase instanceof GalleryRecentsFragment) {
                            Map map = ((GalleryRecentsFragment) mediaGalleryFragmentBase).A09;
                            if (map.containsKey(BDy.B7k())) {
                                indexOf = C007103b.A0Y(C007103b.A0V(map.values())).indexOf(BDy);
                            }
                        }
                        num = null;
                        r7.setCheckedPosition(num);
                        r7.setChecked(mediaGalleryFragmentBase.A1j(i3));
                    }
                    num = Integer.valueOf(indexOf);
                    r7.setCheckedPosition(num);
                    r7.setChecked(mediaGalleryFragmentBase.A1j(i3));
                } else {
                    C36441kJ.A1D(r7);
                    r7.setBackgroundColor(mediaGalleryFragmentBase.A02);
                    r7.setImageDrawable((Drawable) null);
                    r7.setCheckedPosition((Integer) null);
                    r7.setChecked(false);
                }
                if (!mediaGalleryFragmentBase.A0T) {
                    mediaGalleryFragmentBase.A0T = true;
                    r7.getViewTreeObserver().addOnPreDrawListener(new C90004Ys(mediaGalleryFragmentBase, r7, 1));
                }
                if (BDy != null) {
                    return;
                }
                if (AnonymousClass1Ax.A03(mediaGalleryFragmentBase.A1Z(), 6789)) {
                    MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0e.getValue();
                    C88924Uo r6 = mediaGalleryFragmentBase.A0G;
                    AnonymousClass040 A003 = C109325Xd.A00(mediaGalleryFragmentViewModel);
                    mediaGalleryFragmentViewModel.A0A.BwB(AnonymousClass0A2.A02(C023109s.A01, mediaGalleryFragmentViewModel.A08, new MediaGalleryFragmentViewModel$processMediaItem$mediaItemJob$1(r6, mediaGalleryFragmentViewModel, (C023509x) null, i3), A003));
                    return;
                }
                C19930wk r2 = mediaGalleryFragmentBase.A0O;
                if (r2 != null) {
                    r2.execute(new C81283wl((Object) mediaGalleryFragmentBase, i3, 33));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUs(ViewGroup viewGroup) {
        AnonymousClass00C.A0D(viewGroup, 0);
        C18820ts r2 = this.A01.A0E;
        if (r2 != null) {
            View inflate = C36331k8.A09(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            AnonymousClass04F.A05(inflate, C36351kA.A1Y(r2) ^ true ? 1 : 0);
            inflate.setClickable(false);
            C41981y5 r3 = new C41981y5(inflate);
            TextView textView = r3.A01;
            C36331k8.A0r(textView.getContext(), textView, R.color.f6nameremoved);
            return r3;
        }
        throw C36321k7.A09();
    }

    public static int A00(MediaGalleryFragmentBase mediaGalleryFragmentBase, int i) {
        return ((C1512778x) ((AnonymousClass4O4) mediaGalleryFragmentBase.A0a.get(i))).bucketCount;
    }

    public static final void A01(C41981y5 r6, C41101wc r7, StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, int i) {
        int i2;
        C89004Uw r1;
        boolean z;
        AnonymousClass4V2 r12;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = r7.A01;
        if (mediaGalleryFragmentBase.A0R && mediaGalleryFragmentBase.A0G != null) {
            boolean isChecked = r6.A00.isChecked();
            C88924Uo r0 = mediaGalleryFragmentBase.A0G;
            int i3 = 0;
            if (r0 != null) {
                i2 = r0.getCount();
            } else {
                i2 = 0;
            }
            int i4 = i2 - 1;
            int i5 = mediaGalleryFragmentBase.A03;
            if (i5 == 0 || i5 == 1) {
                int i6 = 0;
                while (i3 < i) {
                    int A002 = A00(mediaGalleryFragmentBase, i3);
                    if (i3 == i) {
                        i4 = (A002 + i6) - 1;
                    } else {
                        i6 += A002;
                    }
                    i3++;
                }
                i3 = i6;
            }
            ArrayList A0I = AnonymousClass001.A0I();
            if (i3 <= i4) {
                while (true) {
                    C88924Uo r02 = mediaGalleryFragmentBase.A0G;
                    if (r02 != null) {
                        r12 = r02.BDy(i3);
                    } else {
                        r12 = null;
                    }
                    if (r12 instanceof C74833mF) {
                        A0I.add(((C74833mF) r12).A02);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3++;
                }
            }
            int size = A0I.size();
            if (isChecked) {
                if (size != 0) {
                    if (!storageUsageMediaGalleryFragment.A1i()) {
                        ((C89004Uw) storageUsageMediaGalleryFragment.A0i()).Bur((AnonymousClass3T1) C36441kJ.A12(A0I));
                    }
                    r1 = (C89004Uw) storageUsageMediaGalleryFragment.A0i();
                    z = true;
                } else {
                    return;
                }
            } else if (size != 0) {
                r1 = (C89004Uw) storageUsageMediaGalleryFragment.A0i();
                z = false;
            } else {
                return;
            }
            r1.BsB(A0I, z);
            storageUsageMediaGalleryFragment.A1b();
        }
    }

    public long A0E(int i) {
        AnonymousClass4V2 r3;
        Uri B7k;
        C88924Uo r0 = this.A01.A0G;
        if (r0 != null) {
            r3 = r0.BDy(i);
        } else {
            r3 = null;
        }
        if (!this.A00 || r3 == null || (B7k = r3.B7k()) == Uri.EMPTY) {
            return 0;
        }
        Map map = this.A04;
        Number number = (Number) map.get(B7k);
        if (number == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            number = Long.valueOf(j);
            map.put(B7k, number);
        }
        return number.longValue();
    }

    public int A0J() {
        boolean A0E = this.A02.A0E(4647);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        if (!A0E) {
            return mediaGalleryFragmentBase.A01;
        }
        C88924Uo r0 = mediaGalleryFragmentBase.A0G;
        if (r0 != null) {
            return r0.getCount();
        }
        return 0;
    }

    public int BAF(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return A00(mediaGalleryFragmentBase, i);
        }
        return mediaGalleryFragmentBase.A01;
    }

    public int BCL() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        int i = mediaGalleryFragmentBase.A03;
        if (i == 0 || i == 1) {
            return mediaGalleryFragmentBase.A0a.size();
        }
        return 1;
    }

    public long BCM(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        int i2 = mediaGalleryFragmentBase.A03;
        if (i2 == 0 || i2 == 1) {
            return -((Calendar) ((AnonymousClass4O4) mediaGalleryFragmentBase.A0a.get(i))).getTimeInMillis();
        }
        return 1;
    }

    public /* bridge */ /* synthetic */ void BSC(AnonymousClass0D3 r8, int i) {
        boolean z;
        TextView textView;
        int i2;
        C41981y5 r82 = (C41981y5) r8;
        int i3 = 0;
        AnonymousClass00C.A0D(r82, 0);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        int i4 = mediaGalleryFragmentBase.A03;
        if (i4 == 0 || i4 == 1) {
            r82.A01.setText(mediaGalleryFragmentBase.A0a.get(i).toString());
        } else {
            if (i4 == 2) {
                textView = r82.A01;
                i2 = R.string.f12nameremoved;
            } else if (i4 == 3) {
                textView = r82.A01;
                i2 = R.string.f12nameremoved;
            }
            textView.setText(i2);
        }
        if (mediaGalleryFragmentBase.A0S) {
            CheckBox checkBox = r82.A00;
            checkBox.setVisibility(0);
            checkBox.setEnabled(mediaGalleryFragmentBase.A0R);
            C88924Uo r1 = mediaGalleryFragmentBase.A0G;
            if (r1 != null && mediaGalleryFragmentBase.A0R) {
                int count = r1.getCount() - 1;
                int i5 = mediaGalleryFragmentBase.A03;
                if ((i5 == 0 || i5 == 1) && i >= 0) {
                    int i6 = 0;
                    while (true) {
                        if (i6 == i) {
                            count = (A00(mediaGalleryFragmentBase, i6) + i3) - 1;
                        } else {
                            i3 += A00(mediaGalleryFragmentBase, i6);
                        }
                        if (i6 == i) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i3 <= count) {
                    while (true) {
                        if (mediaGalleryFragmentBase.A1j(i3)) {
                            if (i3 == count) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                checkBox.setChecked(z);
                checkBox.setOnClickListener(new AnonymousClass3YL(this, i, 11, r82));
                return;
            }
            z = false;
            checkBox.setChecked(z);
            checkBox.setOnClickListener(new AnonymousClass3YL(this, i, 11, r82));
            return;
        }
        r82.A00.setVisibility(8);
        r82.A0H.setOnClickListener((View.OnClickListener) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r0.A00.A0E(4261) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0D3 BUw(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.gallery.MediaGalleryFragmentBase r3 = r5.A03
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r5.A01
            boolean r0 = r1 instanceof com.whatsapp.storage.StorageUsageMediaGalleryFragment
            if (r0 == 0) goto L_0x0019
            X.01I r0 = r1.A0h()
            X.2Ti r4 = new X.2Ti
            r4.<init>(r0)
        L_0x0013:
            X.1xr r0 = new X.1xr
            r0.<init>(r3, r4)
            return r0
        L_0x0019:
            boolean r0 = r1 instanceof com.whatsapp.gallerypicker.MediaPickerFragment
            if (r0 == 0) goto L_0x002f
            com.whatsapp.gallerypicker.MediaPickerFragment r1 = (com.whatsapp.gallerypicker.MediaPickerFragment) r1
            X.01I r0 = r1.A0h()
            X.2UM r4 = new X.2UM
            r4.<init>(r0)
            boolean r0 = com.whatsapp.gallerypicker.MediaPickerFragment.A03(r1)
            r4.A0A = r0
            goto L_0x0013
        L_0x002f:
            boolean r0 = r1 instanceof com.whatsapp.gallery.MediaGalleryFragment
            if (r0 == 0) goto L_0x0040
            X.01I r0 = r1.A0h()
            X.2Ti r4 = new X.2Ti
            r4.<init>(r0)
            r0 = 2
            r4.A00 = r0
            goto L_0x0013
        L_0x0040:
            com.whatsapp.gallery.GalleryRecentsFragment r1 = (com.whatsapp.gallery.GalleryRecentsFragment) r1
            X.01I r0 = r1.A0h()
            X.2UM r4 = new X.2UM
            r4.<init>(r0)
            com.whatsapp.gallery.GalleryTabHostFragment r0 = r1.A03
            r2 = 1
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.A1a()
            if (r0 != r2) goto L_0x0067
            X.3l9 r0 = r1.A0M
            if (r0 == 0) goto L_0x0069
            X.0yC r1 = r0.A00
            r0 = 4261(0x10a5, float:5.971E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            r4.A0A = r2
            goto L_0x0013
        L_0x0067:
            r2 = 0
            goto L_0x0064
        L_0x0069:
            java.lang.String r0 = "mediaTray"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41101wc.BUw(android.view.ViewGroup, int):X.0D3");
    }

    public /* bridge */ /* synthetic */ boolean Bhn(MotionEvent motionEvent, AnonymousClass0D3 r7, int i) {
        C41981y5 r72 = (C41981y5) r7;
        C36321k7.A0v(r72, 0, motionEvent);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        if (!mediaGalleryFragmentBase.A0S) {
            return false;
        }
        float x = motionEvent.getX();
        CheckBox checkBox = r72.A00;
        if (x < checkBox.getX() || !mediaGalleryFragmentBase.A0R) {
            return false;
        }
        C36421kH.A16(checkBox);
        A01(r72, this, (StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, i);
        return true;
    }

    public C41101wc(C20810yC r2, MediaGalleryFragmentBase mediaGalleryFragmentBase, MediaGalleryFragmentBase mediaGalleryFragmentBase2) {
        this.A02 = r2;
        this.A03 = mediaGalleryFragmentBase;
        this.A01 = mediaGalleryFragmentBase2;
    }
}
