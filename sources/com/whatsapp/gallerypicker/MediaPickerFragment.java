package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass0CZ;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1A2;
import X.AnonymousClass1JI;
import X.AnonymousClass1YL;
import X.AnonymousClass2Ty;
import X.AnonymousClass2UM;
import X.AnonymousClass3MW;
import X.AnonymousClass3UF;
import X.AnonymousClass4US;
import X.AnonymousClass4V2;
import X.AnonymousClass4VN;
import X.AnonymousClass6QO;
import X.C007103b;
import X.C021809f;
import X.C1270866x;
import X.C132366Tg;
import X.C132726Uz;
import X.C19970wo;
import X.C224514j;
import X.C26981Mg;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C41301wz;
import X.C74153l9;
import X.C80243v5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.gallery.NewMediaPickerFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MediaPickerFragment extends Hilt_MediaPickerFragment implements AnonymousClass4US {
    public int A00;
    public int A01;
    public long A02;
    public C021809f A03;
    public AnonymousClass0V9 A04;
    public C132726Uz A05;
    public AnonymousClass185 A06;
    public C19970wo A07;
    public C41301wz A08;
    public AnonymousClass11F A09;
    public AnonymousClass1YL A0A;
    public AnonymousClass1A2 A0B;
    public AnonymousClass1JI A0C;
    public C1270866x A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public BroadcastReceiver A0I;
    public Integer A0J;
    public boolean A0K = true;
    public final C132366Tg A0L = new C132366Tg();
    public final HashSet A0M = C36441kJ.A17();

    public void A1N(int i, int i2, Intent intent) {
        if (i == 1) {
            AnonymousClass01I A0i = A0i();
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            if (i2 == -1) {
                A0i.setResult(-1, intent);
            } else if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        A0i.setResult(2);
                    } else {
                        return;
                    }
                } else if (intent != null) {
                    ArrayList<Object> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    this.A0J = Integer.valueOf(intent.getIntExtra("media_quality_selection", 0));
                    HashSet hashSet = this.A0M;
                    hashSet.clear();
                    if (parcelableArrayListExtra != null) {
                        hashSet.addAll(parcelableArrayListExtra);
                    }
                    if (this instanceof NewMediaPickerFragment) {
                        NewMediaPickerFragment newMediaPickerFragment = (NewMediaPickerFragment) this;
                        if (parcelableArrayListExtra != null) {
                            int size = parcelableArrayListExtra.size();
                            Set set = newMediaPickerFragment.A05;
                            if (size < set.size()) {
                                ArrayList A0J2 = C36321k7.A0J(parcelableArrayListExtra);
                                for (Object obj : parcelableArrayListExtra) {
                                    A0J2.add(obj.toString());
                                }
                                Set A0f = C007103b.A0f(A0J2);
                                ArrayList A0I2 = AnonymousClass001.A0I();
                                for (Object next : set) {
                                    if (A0f.contains(((AnonymousClass4V2) next).B7k().toString())) {
                                        A0I2.add(next);
                                    }
                                }
                                set.clear();
                                set.addAll(A0I2);
                                RecyclerView recyclerView = newMediaPickerFragment.A03;
                                AnonymousClass0CZ r0 = null;
                                if (recyclerView != null) {
                                    r0 = recyclerView.A0G;
                                }
                                C36411kG.A1R(r0, set);
                            }
                        }
                    }
                    AnonymousClass0V9 r02 = this.A04;
                    if (r02 == null) {
                        A1m();
                    } else {
                        r02.A06();
                    }
                    this.A0L.A05(intent.getExtras());
                    A1b();
                    return;
                } else {
                    return;
                }
            } else if (!A1i()) {
                this.A0L.A00.clear();
                return;
            } else {
                return;
            }
            A0i.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004b, code lost:
        if (A03(r8) != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1P(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1
            r8.A0Y = r0
            X.0wo r0 = r8.A07
            if (r0 == 0) goto L_0x0159
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A02 = r0
            X.01I r1 = r8.A0i()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.AnonymousClass00C.A0E(r1, r0)
            android.content.Intent r6 = r1.getIntent()
            X.0yC r1 = r8.A1Z()
            r0 = 2614(0xa36, float:3.663E-42)
            int r1 = r1.A07(r0)
            java.lang.String r0 = "max_items"
            int r0 = r6.getIntExtra(r0, r1)
            r8.A01 = r0
            java.lang.String r0 = "skip_max_items_new_limit"
            r3 = 0
            boolean r0 = r6.getBooleanExtra(r0, r3)
            r8.A0H = r0
            java.lang.String r0 = "preview"
            r5 = 1
            boolean r0 = r6.getBooleanExtra(r0, r5)
            r8.A0K = r0
            java.lang.String r0 = "is_in_multi_select_mode_only"
            boolean r0 = r6.getBooleanExtra(r0, r3)
            if (r0 != 0) goto L_0x004d
            boolean r1 = A03(r8)
            r0 = 0
            if (r1 == 0) goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            r8.A0F = r0
            android.content.Context r1 = r8.A0a()
            X.3Zz r0 = new X.3Zz
            r0.<init>(r1, r8)
            r8.A03 = r0
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x0062
            r8.A1m()
        L_0x0062:
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.getStringExtra(r0)
            X.11F r0 = r1.A02(r0)
            r8.A09 = r0
            java.lang.String r0 = "is_favorite_filter_enabled"
            boolean r0 = r6.getBooleanExtra(r0, r3)
            r8.A0E = r0
            r7 = 7
            r8.A00 = r7
            X.01I r0 = r8.A0i()
            X.14u r1 = X.C36401kF.A0L(r0)
            android.content.Intent r2 = r1.getIntent()
            if (r2 == 0) goto L_0x00fc
            java.lang.String r4 = r2.resolveType(r1)
            if (r4 == 0) goto L_0x00c8
            java.lang.String r0 = "vnd.android.cursor.dir/image"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "image/*"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00ab
        L_0x009f:
            r8.A00 = r5
            r0 = 2131896910(0x7f122a4e, float:1.9428695E38)
            java.lang.String r0 = r8.A0n(r0)
            r1.setTitle(r0)
        L_0x00ab:
            java.lang.String r0 = "vnd.android.cursor.dir/video"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "video/*"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00c8
        L_0x00bb:
            r0 = 4
            r8.A00 = r0
            r0 = 2131896911(0x7f122a4f, float:1.9428697E38)
            java.lang.String r0 = r8.A0n(r0)
            r1.setTitle(r0)
        L_0x00c8:
            android.os.Bundle r4 = r2.getExtras()
            if (r4 == 0) goto L_0x00fc
            java.lang.String r0 = "window_title"
            java.lang.String r2 = r4.getString(r0)
            if (r2 == 0) goto L_0x00f1
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00f1
            r1.A3F(r2)
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x00f1
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            if (r1 == 0) goto L_0x00f1
            r1.setTitle((java.lang.CharSequence) r2)
        L_0x00f1:
            int r1 = r8.A00
            java.lang.String r0 = "include_media"
            int r0 = r4.getInt(r0, r1)
            r7 = r7 & r0
            r8.A00 = r7
        L_0x00fc:
            java.lang.String r0 = "android.intent.extra.STREAM"
            if (r9 == 0) goto L_0x014d
            java.util.ArrayList r1 = r9.getParcelableArrayList(r0)
        L_0x0104:
            if (r1 == 0) goto L_0x011a
            boolean r0 = X.C36411kG.A1a(r1)
            if (r0 == 0) goto L_0x011a
            java.util.HashSet r0 = r8.A0M
            r0.clear()
            r0.addAll(r1)
            r8.A1m()
            r8.A1b()
        L_0x011a:
            r8.A10(r5)
            r8.A1g(r3)
            com.whatsapp.StickyHeadersRecyclerView r4 = r8.A08
            if (r4 == 0) goto L_0x0138
            X.1JI r3 = r8.A0C
            if (r3 == 0) goto L_0x0152
            android.app.Activity r2 = X.C36361kB.A06(r4)
            r1 = 3
            r3.A01(r2)
            X.1ww r0 = new X.1ww
            r0.<init>(r2, r3, r1)
            r4.A0v(r0)
        L_0x0138:
            int r0 = r8.A01
            if (r0 <= r5) goto L_0x014c
            X.1wz r1 = new X.1wz
            r1.<init>(r8)
            com.whatsapp.StickyHeadersRecyclerView r0 = r8.A08
            if (r0 == 0) goto L_0x014a
            java.util.ArrayList r0 = r0.A13
            r0.add(r1)
        L_0x014a:
            r8.A08 = r1
        L_0x014c:
            return
        L_0x014d:
            java.util.ArrayList r1 = r6.getParcelableArrayListExtra(r0)
            goto L_0x0104
        L_0x0152:
            java.lang.String r0 = "scrollPerfLoggerManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0159:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A1P(android.os.Bundle):void");
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.A1R(bundle);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", C36441kJ.A15(this.A0M));
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        AnonymousClass00C.A0D(menu, 0);
        if (this.A01 > 1) {
            menu.add(0, R.id.menuitem_select_multiple, 0, A0n(R.string.f12nameremoved)).setIcon(AnonymousClass3UF.A02(A0a(), R.drawable.ic_action_select_multiple_teal, C224514j.A00(A1D(), R.attr.f4nameremoved, R.color.f6nameremoved))).setShowAsAction(2);
        }
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
            return false;
        }
        C1270866x r2 = this.A0D;
        if (r2 != null) {
            r2.A02(33, 1, 1);
            A1m();
            A1b();
            return true;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }

    public boolean A1k(AnonymousClass4V2 r6, AnonymousClass2Ty r7) {
        if (((this.A09 instanceof C28981Uw) && !A1Z().A0E(5643)) || this.A01 <= 1) {
            return false;
        }
        C1270866x r3 = this.A0D;
        if (r3 != null) {
            r3.A02(Integer.valueOf(AnonymousClass3MW.A01(r6.BEF())), 4, 1);
            HashSet hashSet = this.A0M;
            Uri B7k = r6.B7k();
            if (!C007103b.A0j(hashSet, B7k) && this.A08 != null && hashSet.size() < this.A01 && this.A08 != null) {
                int A012 = RecyclerView.A01(r7);
                C41301wz r1 = this.A08;
                if (r1 != null) {
                    r1.A04 = true;
                    r1.A03 = A012;
                    r1.A00 = C36441kJ.A07(r7);
                }
            }
            if (A1i()) {
                A1n(r6);
                return true;
            }
            hashSet.add(B7k);
            this.A0L.A06(new AnonymousClass6QO(B7k));
            AnonymousClass01I A0i = A0i();
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AnonymousClass01L r12 = (AnonymousClass01L) A0i;
            C021809f r0 = this.A03;
            if (r0 == null) {
                throw C36331k8.A0d("actionModeCallback");
            }
            this.A04 = r12.But(r0);
            A1b();
            A1d(hashSet.size());
            return true;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b7, code lost:
        if (r5 != false) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1o(java.util.Set r21) {
        /*
            r20 = this;
            r8 = 0
            r9 = 1
            if (r21 == 0) goto L_0x01b2
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x01b2
            java.util.ArrayList r7 = X.C36441kJ.A15(r21)
            r6 = r20
            X.01I r14 = r6.A0i()
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x02a1
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "origin"
            int r5 = r1.getIntExtra(r0, r9)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "should_send_media"
            boolean r10 = r1.getBooleanExtra(r0, r9)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "should_hide_caption_view"
            boolean r12 = r1.getBooleanExtra(r0, r8)
            X.01I r11 = r6.A0i()
            X.3FR r4 = new X.3FR
            r4.<init>(r11)
            r4.A0H = r7
            X.11F r0 = r6.A09
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            r4.A0D = r0
            int r1 = r6.A01
            java.util.HashSet r13 = r6.A0M
            int r0 = r13.size()
            int r1 = r1 - r0
            r4.A01 = r1
            boolean r0 = r6.A0G
            r4.A0Q = r0
            r4.A02 = r5
            X.0wo r0 = r6.A07
            if (r0 == 0) goto L_0x029a
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.A02
            long r0 = r0 - r2
            r4.A05 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "picker_open_time"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            r4.A06 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "quoted_message_row_id"
            long r0 = r1.getLongExtra(r0, r2)
            r4.A07 = r0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.A0E = r0
            r0 = 20
            boolean r0 = X.C36381kD.A1U(r5, r0)
            r4.A0M = r0
            r4.A0P = r10
            r4.A0O = r12
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "number_from_url"
            boolean r0 = r1.getBooleanExtra(r0, r8)
            r4.A0K = r0
            r0 = 35
            if (r5 == r0) goto L_0x01c1
            r0 = 37
            if (r5 == r0) goto L_0x01c1
            r0 = 40
            if (r5 == r0) goto L_0x01c1
            if (r10 == 0) goto L_0x01c1
            r4.A0N = r9
        L_0x00b5:
            X.6Uz r2 = r6.A05
            if (r2 == 0) goto L_0x0293
            boolean r1 = r6.A1i()
            int r0 = r13.size()
            r2.A04(r1, r0)
            X.6Tg r3 = r6.A0L
            java.lang.Object r0 = r7.get(r8)
            android.net.Uri r0 = (android.net.Uri) r0
            X.6QO r5 = r3.A03(r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.util.ArrayList r2 = X.C65713Te.A03(r0)
            X.1YL r1 = r6.A0A
            if (r1 == 0) goto L_0x028c
            java.lang.String r0 = r5.A0C()
            java.util.List r1 = r1.A00(r0)
            if (r2 == 0) goto L_0x010c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x010c
            if (r1 == 0) goto L_0x00fa
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x010c
        L_0x00fa:
            X.1YL r1 = r6.A0A
            if (r1 == 0) goto L_0x0285
            java.lang.String r0 = r5.A0D()
            r1.A01(r0, r2)
            java.lang.String r0 = r5.A0D()
            r5.A0J(r0)
        L_0x010c:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r1 = r5.A0A()
            if (r2 == 0) goto L_0x012d
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x012d
            if (r1 == 0) goto L_0x012a
            int r0 = r1.length()
            if (r0 != 0) goto L_0x012d
        L_0x012a:
            r5.A0H(r2)
        L_0x012d:
            java.lang.Integer r0 = r6.A0J
            r4.A0B = r0
            X.AnonymousClass3FR.A00(r3, r4)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "is_send_as_document"
            boolean r5 = r1.getBooleanExtra(r0, r8)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "disable_shared_activity_transition_animation"
            boolean r1 = r1.getBooleanExtra(r0, r8)
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x01ba
            if (r1 != 0) goto L_0x01ba
            int r0 = r7.size()
            if (r0 != r9) goto L_0x01ba
            android.view.View r0 = r6.A0F
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r10 = r7.get(r8)
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto L_0x01b3
            com.whatsapp.StickyHeadersRecyclerView r0 = r6.A08
            if (r0 == 0) goto L_0x01b3
            java.util.Iterator r1 = X.C36381kD.A12(r0)
        L_0x0168:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b3
            android.view.View r2 = X.C36431kI.A0K(r1)
            boolean r0 = r2 instanceof X.AnonymousClass2Ty
            if (r0 == 0) goto L_0x0168
            X.2Ty r2 = (X.AnonymousClass2Ty) r2
            android.net.Uri r0 = r2.getUri()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0168
            r4.A08 = r10
            X.11F r3 = r6.A09
            if (r3 == 0) goto L_0x01cc
            if (r5 == 0) goto L_0x01cc
        L_0x018a:
            X.185 r1 = r6.A06
            if (r1 == 0) goto L_0x01c5
            int r0 = r7.size()
            boolean r0 = X.C25571Gv.A04(r1, r3, r0)
            if (r0 == 0) goto L_0x02bc
            r17 = 0
            java.lang.Object r15 = r7.get(r8)
            android.net.Uri r15 = (android.net.Uri) r15
            r19 = 0
            r16 = r3
            r18 = r17
            android.content.Intent r1 = X.AnonymousClass190.A0R(r14, r15, r16, r17, r18, r19)
            X.AnonymousClass00C.A08(r1)
            r0 = 36
            r14.startActivityForResult(r1, r0)
        L_0x01b2:
            return
        L_0x01b3:
            X.11F r3 = r6.A09
            if (r3 == 0) goto L_0x027d
            if (r5 == 0) goto L_0x027d
            goto L_0x018a
        L_0x01ba:
            X.11F r3 = r6.A09
            if (r3 == 0) goto L_0x0279
            if (r5 == 0) goto L_0x0279
            goto L_0x018a
        L_0x01c1:
            r4.A0N = r8
            goto L_0x00b5
        L_0x01c5:
            java.lang.String r0 = "verifiedNameManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01cc:
            android.content.Intent r4 = r4.A01()
            X.01I r3 = r6.A0i()
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = r10.toString()
            X.C36341k9.A1H(r2, r0, r7)
            android.view.View r1 = r6.A0d()
            r0 = 2131430736(0x7f0b0d50, float:1.8483181E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            android.view.View r1 = r6.A0d()
            r0 = 2131434884(0x7f0b1d84, float:1.8491595E38)
            android.view.View r5 = r1.findViewById(r0)
            X.01I r1 = r6.A0i()
            X.3CG r0 = new X.3CG
            r0.<init>(r1)
            r1 = 2131897113(0x7f122b19, float:1.9429106E38)
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C36401kF.A0o(r0, r1)
            X.C011004s.A08(r5, r0)
            java.lang.String r0 = X.C011004s.A03(r5)
            X.C36341k9.A1H(r5, r0, r7)
            android.view.View r1 = r6.A0d()
            r0 = 2131430458(0x7f0b0c3a, float:1.8482618E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            android.view.View r1 = r6.A0d()
            r0 = 2131430466(0x7f0b0c42, float:1.8482634E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = X.C011004s.A03(r1)
            X.C36341k9.A1H(r1, r0, r7)
            android.graphics.Bitmap r5 = r2.A06
            if (r5 == 0) goto L_0x0255
            X.16L r0 = r6.A09
            if (r0 == 0) goto L_0x0272
            X.1SZ r2 = r0.A02()
            java.lang.StringBuilder r1 = X.C36381kD.A11(r10)
            java.lang.String r0 = "-gallery_thumb"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A0D(r0, r5)
        L_0x0255:
            X.00I[] r0 = new X.AnonymousClass00I[r8]
            java.lang.Object[] r1 = r7.toArray(r0)
            X.00I[] r1 = (X.AnonymousClass00I[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.00I[] r0 = (X.AnonymousClass00I[]) r0
            X.0Gb r0 = X.AnonymousClass0YW.A01(r3, r0)
            android.app.ActivityOptions r0 = r0.A00
            android.os.Bundle r0 = r0.toBundle()
            X.AnonymousClass0XN.A02(r3, r4, r0, r9)
            return
        L_0x0272:
            java.lang.String r0 = "caches"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0279:
            X.01I r14 = r6.A0i()
        L_0x027d:
            android.content.Intent r0 = r4.A01()
            r14.startActivityForResult(r0, r9)
            return
        L_0x0285:
            java.lang.String r0 = "mentionState"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x028c:
            java.lang.String r0 = "mentionState"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0293:
            java.lang.String r0 = "cameraCaptureFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x029a:
            java.lang.String r0 = "time"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x02a1:
            android.content.Intent r2 = X.C36411kG.A0D(r6)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r7)
            int r0 = r7.size()
            if (r0 != r9) goto L_0x02ba
            java.lang.Object r0 = r7.get(r8)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x02b6:
            r2.setData(r0)
            goto L_0x02c9
        L_0x02ba:
            r0 = 0
            goto L_0x02b6
        L_0x02bc:
            android.content.Intent r2 = X.C36411kG.A0D(r6)
            java.util.ArrayList r1 = X.C36441kJ.A15(r7)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putParcelableArrayListExtra(r0, r1)
        L_0x02c9:
            X.C36331k8.A0o(r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.MediaPickerFragment.A1o(java.util.Set):void");
    }

    public static final boolean A03(MediaPickerFragment mediaPickerFragment) {
        if (mediaPickerFragment.A01 <= 1) {
            return false;
        }
        C74153l9 r0 = mediaPickerFragment.A0M;
        if (r0 == null) {
            throw C36331k8.A0d("mediaTray");
        } else if (r0.A00.A0E(4261)) {
            return true;
        } else {
            return false;
        }
    }

    public void A1l() {
        this.A0M.clear();
        if (A03(this)) {
            A1m();
            AnonymousClass0V9 r0 = this.A04;
            if (r0 != null) {
                r0.A06();
            }
        }
        A1b();
    }

    public boolean BPU() {
        int i;
        if (!this.A0H && this.A0M.size() >= (i = this.A01) && !this.A0G) {
            C36371kC.A1N(this, i);
            this.A0G = true;
        }
        if (this.A0M.size() < this.A01) {
            return false;
        }
        return true;
    }

    public void Bpb(AnonymousClass4V2 r3) {
        if (!C007103b.A0j(this.A0M, r3.B7k())) {
            A1n(r3);
        }
    }

    public void Btq() {
        Toast toast = this.A06;
        if (toast != null) {
            toast.cancel();
        }
        AnonymousClass17Y r4 = this.A07;
        if (r4 != null) {
            Context A0a = A0a();
            Object[] A0L2 = AnonymousClass001.A0L();
            AnonymousClass000.A1J(A0L2, this.A01);
            Toast A012 = r4.A01(A0a.getString(R.string.f12nameremoved, A0L2));
            A012.show();
            this.A06 = A012;
            return;
        }
        throw C36321k7.A06();
    }

    public void BwO(AnonymousClass4V2 r3) {
        if (C007103b.A0j(this.A0M, r3.B7k())) {
            A1n(r3);
        }
    }

    public void A1H() {
        ImageView imageView;
        super.A1H();
        this.A04 = null;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            Iterator A12 = C36381kD.A12(stickyHeadersRecyclerView);
            while (A12.hasNext()) {
                View A0K2 = C36431kI.A0K(A12);
                if ((A0K2 instanceof AnonymousClass2UM) && (imageView = (ImageView) A0K2) != null) {
                    imageView.setImageDrawable((Drawable) null);
                }
            }
        }
    }

    public void A1K() {
        super.A1K();
        if (this.A0I != null) {
            A0i().unregisterReceiver(this.A0I);
            this.A0I = null;
        }
    }

    public void A1L() {
        super.A1L();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        this.A0I = new AnonymousClass4VN(this, 3);
        C26981Mg.A01(this.A0I, A0i(), intentFilter, true);
    }

    public void A1m() {
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01L r1 = (AnonymousClass01L) A0i;
        C021809f r0 = this.A03;
        if (r0 == null) {
            throw C36331k8.A0d("actionModeCallback");
        }
        this.A04 = r1.But(r0);
    }

    public void A1n(AnonymousClass4V2 r8) {
        int i;
        Uri B7k = r8.B7k();
        if (A1i()) {
            HashSet hashSet = this.A0M;
            if (C007103b.A0j(hashSet, B7k)) {
                hashSet.remove(B7k);
                this.A0L.A00.remove(B7k);
            } else {
                if (!this.A0H && hashSet.size() >= (i = this.A01) && !this.A0G) {
                    C36371kC.A1N(this, i);
                    this.A0G = true;
                }
                if (hashSet.size() >= this.A01) {
                    Toast toast = this.A06;
                    if (toast != null) {
                        toast.cancel();
                    }
                    AnonymousClass17Y r4 = this.A07;
                    if (r4 != null) {
                        Context A0a = A0a();
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1J(objArr, this.A01);
                        Toast A012 = r4.A01(A0a.getString(R.string.f12nameremoved, objArr));
                        A012.show();
                        this.A06 = A012;
                    } else {
                        throw C36321k7.A06();
                    }
                } else {
                    hashSet.add(B7k);
                    this.A0L.A06(new AnonymousClass6QO(B7k));
                }
            }
            AnonymousClass0V9 r0 = this.A04;
            if (r0 != null) {
                r0.A06();
            }
            if (hashSet.size() > 0) {
                AnonymousClass17Y r3 = this.A07;
                if (r3 != null) {
                    r3.A0I(C80243v5.A00(this, 28), 300);
                } else {
                    throw C36321k7.A06();
                }
            }
            A1b();
        } else if (B7k != null) {
            HashSet A16 = C36441kJ.A16();
            A16.add(B7k);
            A1o(A16);
            this.A0L.A06(new AnonymousClass6QO(B7k));
        }
    }
}
