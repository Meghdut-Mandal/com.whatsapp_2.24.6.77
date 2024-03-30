package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.ContactLiveLocationThumbnail;
import com.whatsapp.location.DragBottomSheetIndicator;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationSharingService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ov  reason: invalid class name and case insensitive filesystem */
public abstract class C142466ov implements C20420xX, LocationListener {
    public int A00;
    public float A01;
    public float A02;
    public long A03 = AnonymousClass6X5.A0L;
    public long A04;
    public Activity A05;
    public Drawable A06;
    public Location A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public RecyclerView A0D;
    public RecyclerView A0E;
    public BottomSheetBehavior A0F;
    public BottomSheetBehavior A0G;
    public AnonymousClass1RY A0H;
    public AnonymousClass11F A0I;
    public DragBottomSheetIndicator A0J;
    public C95964mZ A0K;
    public C119675qG A0L;
    public C122565v3 A0M;
    public AnonymousClass6N8 A0N;
    public C63593Kq A0O;
    public C63593Kq A0P;
    public C63593Kq A0Q;
    public boolean A0R = false;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public float A0X;
    public float A0Y;
    public float A0Z = 0.0f;
    public float A0a;
    public float A0b = 0.0f;
    public float A0c;
    public float A0d;
    public int A0e;
    public int A0f;
    public BroadcastReceiver A0g = new C162357oS(this, 4);
    public Bitmap A0h;
    public Bitmap A0i;
    public View A0j;
    public View A0k;
    public View A0l;
    public View A0m;
    public View A0n;
    public View A0o;
    public TextView A0p;
    public TextEmojiLabel A0q;
    public UserJid A0r;
    public ContactLiveLocationThumbnail A0s;
    public ContactLiveLocationThumbnail A0t;
    public C95964mZ A0u;
    public final Handler A0v = C36341k9.A0H();
    public final C237019m A0w;
    public final C19730wQ A0x;
    public final AnonymousClass16D A0y;
    public final AnonymousClass171 A0z;
    public final C19970wo A10;
    public final C18820ts A11;
    public final AnonymousClass1P5 A12;
    public final AnonymousClass2XH A13;
    public final AnonymousClass1PA A14;
    public final Runnable A15 = new C1503074t(this, 4);
    public final Runnable A16 = new C1503074t(this, 2);
    public final List A17 = AnonymousClass001.A0I();
    public final List A18 = AnonymousClass001.A0I();
    public final List A19 = AnonymousClass001.A0I();
    public final Map A1A = AnonymousClass001.A0J();
    public final Set A1B = C36441kJ.A17();
    public final C24801Dv A1C;
    public final AnonymousClass17Y A1D;
    public final AnonymousClass19J A1E;
    public final C32001cn A1F = new C1030853p(this);
    public final C24361Cd A1G;
    public final AnonymousClass1Pp A1H;
    public final C226815j A1I = new C162747p5(this, 6);
    public final AnonymousClass16I A1J;
    public final C27731Pn A1K;
    public final C27761Ps A1L;
    public final C20830yE A1M;
    public final AnonymousClass191 A1N = new C164897sY(this, 0);
    public final AnonymousClass16J A1O;
    public final C24511Cs A1P = new C162797pA(this, 1);
    public final C233117z A1Q;
    public final AnonymousClass4TK A1R = new C146336vR(this);
    public final AnonymousClass4U8 A1S = new C146346vS(this);
    public final Runnable A1T = new C1503074t(this, 3);
    public volatile boolean A1U;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        r2 = r4.A05.A0R.A04(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        r2 = r3.A06.A00().A00(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C142466ov r8, X.C63593Kq r9) {
        /*
            r0 = 0
            r8.A0Q = r0
            A05(r8)
            if (r9 == 0) goto L_0x0033
            java.util.List r0 = r8.A18
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            X.6N8 r1 = (X.AnonymousClass6N8) r1
            X.3Kq r0 = r1.A02
            if (r0 != r9) goto L_0x000e
        L_0x001e:
            r8.A0E(r1)
            r8.A0Q = r9
            r5 = r8
            X.7pD r5 = (X.C162827pD) r5
            int r0 = r5.A01
            if (r0 == 0) goto L_0x004a
            java.lang.Object r3 = r5.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r3
            X.6Fs r0 = r3.A06
            if (r0 == 0) goto L_0x013c
            goto L_0x0035
        L_0x0033:
            r1 = 0
            goto L_0x001e
        L_0x0035:
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x0044 }
            X.6a2 r2 = (X.C133816a2) r2     // Catch:{ RemoteException -> 0x0044 }
            android.os.Parcel r1 = X.C133816a2.A00(r2)     // Catch:{ RemoteException -> 0x0044 }
            r0 = 8
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x0044 }
            goto L_0x00c7
        L_0x0044:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x004a:
            java.lang.Object r4 = r5.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r4 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r4
            X.6jV r0 = r4.A05
            X.C18740tg.A06(r0)
            r0.A06()
            r7 = 1
            r5.A0W = r7
            android.view.View r2 = r5.A0C
            X.6ov r0 = r4.A0N
            X.3Kq r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x0064
            r0 = 0
        L_0x0064:
            r2.setVisibility(r0)
            X.5B8 r1 = r4.A0M
            r0 = 2
            r1.setLocationMode(r0)
            double r2 = r9.A00
            double r0 = r9.A01
            X.6bv r5 = X.C134976bv.A00(r2, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r6 = com.whatsapp.location.GroupChatLiveLocationsActivity.A01(r4, r1, r0)
            r4.A0W = r7
            X.6jV r0 = r4.A05
            float r0 = X.C134996bx.A00(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            X.6jV r0 = r4.A05
            X.6WY r0 = r0.A0R
            android.graphics.Point r2 = r0.A04(r5)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x00bd
            int r0 = r2.y
            if (r0 <= 0) goto L_0x00bd
            X.5B8 r0 = r4.A0M
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x00bd
            int r1 = r2.y
            X.5B8 r0 = r4.A0M
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x00bd
            X.6jV r3 = r4.A05
            X.64g r2 = X.C1264964g.A00(r5, r6)
        L_0x00b1:
            X.7ia r1 = r4.A04
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.A0A(r2, r1, r0)
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0G(r4)
            goto L_0x013c
        L_0x00bd:
            X.6jV r3 = r4.A05
            X.64g r2 = new X.64g
            r2.<init>()
            r2.A06 = r5
            goto L_0x00b1
        L_0x00c7:
            r4 = 1
            r5.A0W = r4
            android.view.View r2 = r5.A0C
            X.6ov r0 = r3.A0O
            X.3Kq r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x00d5
            r0 = 0
        L_0x00d5:
            r2.setVisibility(r0)
            X.5B9 r1 = r3.A0N
            r0 = 2
            r1.setLocationMode(r0)
            boolean r0 = r3.A0X
            if (r0 != 0) goto L_0x0139
            r3.A0X = r4
            double r4 = r9.A00
            double r0 = r9.A01
            com.google.android.gms.maps.model.LatLng r4 = X.C90524aI.A0F(r4, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r5 = com.whatsapp.location.GroupChatLiveLocationsActivity2.A01(r3, r1, r0)
            X.6Fs r0 = r3.A06
            r0.A05()
            X.6Fs r0 = r3.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0145
            X.6Fs r0 = r3.A06
            X.68Y r0 = r0.A00()
            android.graphics.Point r2 = r0.A00(r4)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x0145
            int r0 = r2.y
            if (r0 <= 0) goto L_0x0145
            X.5B9 r0 = r3.A0N
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x0145
            int r1 = r2.y
            X.5B9 r0 = r3.A0N
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x0145
            X.6Fs r0 = r3.A06
            r0.A05()
            X.6Fs r2 = r3.A06
            X.5iH r1 = X.AnonymousClass6UP.A02(r4, r5)
        L_0x0134:
            X.7iq r0 = r3.A05
            r2.A0B(r1, r0)
        L_0x0139:
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0G(r3)
        L_0x013c:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r8.A0F
            if (r1 == 0) goto L_0x0144
            r0 = 4
            r1.A0W(r0)
        L_0x0144:
            return
        L_0x0145:
            X.6Fs r2 = r3.A06
            X.5iH r1 = X.AnonymousClass6UP.A01(r4)
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142466ov.A0A(X.6ov, X.3Kq):void");
    }

    public AnonymousClass0FM A0H(int i) {
        if (i == 0) {
            C39001qm A002 = AnonymousClass3LW.A00(this.A05);
            A002.A0c(R.string.f12nameremoved);
            A002.A0r(true);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            C163297py.A01(A002, this, 27, R.string.f12nameremoved);
            AnonymousClass0FM create = A002.create();
            create.A02().A0T(1);
            return create;
        } else if (i != 2) {
            return null;
        } else {
            C163297py r2 = new C163297py(this, 28);
            C39001qm A003 = AnonymousClass3LW.A00(this.A05);
            A003.A0d(R.string.f12nameremoved);
            A003.A0c(R.string.f12nameremoved);
            A003.A0r(true);
            A003.A0h(r2, R.string.f12nameremoved);
            return A003.create();
        }
    }

    public C131126Nv A0L() {
        C162827pD r0 = (C162827pD) this;
        int i = r0.A01;
        Object obj = r0.A00;
        if (i != 0) {
            C129186Fs r02 = ((GroupChatLiveLocationsActivity2) obj).A06;
            if (r02 != null) {
                return new C131126Nv(r02.A00());
            }
            return null;
        }
        C139266jV r03 = ((GroupChatLiveLocationsActivity) obj).A05;
        if (r03 != null) {
            return new C131126Nv(r03.A0R);
        }
        return null;
    }

    public void A0N() {
        C139266jV r3;
        C1264964g r2;
        LatLng latLng;
        C129186Fs r22;
        C115065iH A012;
        C162827pD r4 = (C162827pD) this;
        if (r4.A01 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) r4.A00;
            if (!(!groupChatLiveLocationsActivity2.A0E) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0X) {
                C142466ov r1 = groupChatLiveLocationsActivity2.A0O;
                if (r1.A0Q == null || r4.A0V) {
                    AnonymousClass6N8 r0 = r1.A0N;
                    if (r0 != null) {
                        latLng = r0.A00();
                        if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(latLng)) {
                            C142466ov r12 = groupChatLiveLocationsActivity2.A0O;
                            if (!r12.A0V) {
                                groupChatLiveLocationsActivity2.A0X = true;
                                r22 = groupChatLiveLocationsActivity2.A06;
                                A012 = AnonymousClass6UP.A01(latLng);
                            } else if (GroupChatLiveLocationsActivity2.A0J(r12.A0N.A00(), groupChatLiveLocationsActivity2)) {
                                groupChatLiveLocationsActivity2.A0O.A0O();
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!r1.A0W) {
                        GroupChatLiveLocationsActivity2.A0I(groupChatLiveLocationsActivity2, true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    groupChatLiveLocationsActivity2.A0X = true;
                    C63593Kq r23 = groupChatLiveLocationsActivity2.A0O.A0Q;
                    latLng = C90524aI.A0F(r23.A00, r23.A01);
                    float A013 = GroupChatLiveLocationsActivity2.A01(groupChatLiveLocationsActivity2, r23.A02, -1.0f);
                    if (A013 <= groupChatLiveLocationsActivity2.A06.A02().A02 && A013 != -1.0f) {
                        r22 = groupChatLiveLocationsActivity2.A06;
                        A012 = AnonymousClass6UP.A02(latLng, A013);
                    }
                    r22 = groupChatLiveLocationsActivity2.A06;
                    A012 = AnonymousClass6UP.A01(latLng);
                }
                r22.A0B(A012, groupChatLiveLocationsActivity2.A05);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) r4.A00;
        if (!(!groupChatLiveLocationsActivity.A0E) && groupChatLiveLocationsActivity.A05 != null) {
            if (groupChatLiveLocationsActivity.A0N.A0Q != null && !groupChatLiveLocationsActivity.A0W) {
                groupChatLiveLocationsActivity.A0W = true;
                C63593Kq r6 = groupChatLiveLocationsActivity.A0N.A0Q;
                C134976bv A002 = C134976bv.A00(r6.A00, r6.A01);
                float A014 = GroupChatLiveLocationsActivity.A01(groupChatLiveLocationsActivity, r6.A02, -1.0f);
                if (A014 > C134996bx.A00(groupChatLiveLocationsActivity.A05) || A014 == -1.0f) {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = new C1264964g();
                    r2.A06 = A002;
                } else {
                    r3 = groupChatLiveLocationsActivity.A05;
                    r2 = C1264964g.A00(A002, A014);
                }
                r3.A0A(r2, groupChatLiveLocationsActivity.A04, 1500);
            } else if (!groupChatLiveLocationsActivity.A0N.A0W) {
                GroupChatLiveLocationsActivity.A0I(groupChatLiveLocationsActivity, true);
            }
        }
    }

    public void A0O() {
        this.A0Q = null;
        this.A0L = null;
        A0E((AnonymousClass6N8) null);
        A05(this);
        this.A0K.A06();
    }

    public void A0R() {
        C237019m r5 = this.A0w;
        this.A0S = r5.A07();
        this.A0T = this.A1M.A05();
        Context applicationContext = this.A05.getApplicationContext();
        AnonymousClass1P5 r4 = this.A12;
        LocationSharingService.A02(applicationContext, r4);
        if (this.A0O == null) {
            r4.A0Z(this.A1R);
            AnonymousClass4U8 r2 = this.A1S;
            List list = r4.A0U;
            if (!list.contains(r2)) {
                list.add(r2);
            }
            A03();
        }
        A06(this);
        this.A05.invalidateOptionsMenu();
        C26981Mg.A01(this.A0g, this.A05, new IntentFilter("android.location.PROVIDERS_CHANGED"), true);
        if (r4.A0f(this.A0I)) {
            r5.A06(this, "group-chat-live-location-ui-onresume", 0.0f, 3, 5000, 1000);
        }
        this.A1E.registerObserver(this);
    }

    public void A0S() {
        C162827pD r2 = (C162827pD) this;
        int i = r2.A01;
        Object obj = r2.A00;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            if (!(!groupChatLiveLocationsActivity2.A0E)) {
                GroupChatLiveLocationsActivity2.A0G(groupChatLiveLocationsActivity2);
                r2.A0N();
                if (!groupChatLiveLocationsActivity2.A0O.A0W) {
                    groupChatLiveLocationsActivity2.A0N.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
        if (!(!groupChatLiveLocationsActivity.A0E)) {
            GroupChatLiveLocationsActivity.A0G(groupChatLiveLocationsActivity);
            r2.A0N();
            if (!groupChatLiveLocationsActivity.A0N.A0W) {
                groupChatLiveLocationsActivity.A0M.setLocationMode(2);
            }
        }
    }

    public void A0T(float f, boolean z) {
        C162827pD r3 = (C162827pD) this;
        int i = r3.A01;
        Object obj = r3.A00;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            int i2 = (int) f;
            groupChatLiveLocationsActivity2.A01 = i2;
            C129186Fs r0 = groupChatLiveLocationsActivity2.A06;
            if (r0 != null) {
                r0.A08(0, 0, 0, i2);
            }
        } else {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
            int i3 = (int) f;
            groupChatLiveLocationsActivity.A01 = i3;
            C139266jV r02 = groupChatLiveLocationsActivity.A05;
            if (r02 != null) {
                r02.A07(0, 0, i3);
            }
        }
        if (z) {
            r3.A0N();
        }
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    private void A02() {
        C18820ts r6 = this.A11;
        List list = this.A19;
        Object[] objArr = new Object[1];
        boolean A1b = C36361kB.A1b(objArr, list.size());
        this.A0p.setText(r6.A0L(objArr, R.plurals.f10nameremoved, (long) list.size()));
        this.A0u.A06();
        if (this.A0o != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A05.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, (double) list.size()) * ((double) this.A0c)), displayMetrics.heightPixels / 2);
            this.A0F.A0d(true);
            this.A0F.A0W(5);
            int i = this.A0G.A0J;
            RecyclerView recyclerView = this.A0E;
            if (i != 3) {
                C90514aH.A1J(recyclerView, -1, min);
                this.A0G.A0W(3);
            } else if (min != recyclerView.getHeight()) {
                this.A0E.clearAnimation();
                C92544e9 r2 = new C92544e9(this.A0E, this, min);
                r2.setDuration((long) ((int) (((float) min) / C36341k9.A00(this.A05))));
                A08(this, (float) this.A0F.A0S(), A1b);
                this.A0E.startAnimation(r2);
            }
        } else if (this.A09.getTranslationY() != 0.0f) {
            this.A09.clearAnimation();
            View view = this.A09;
            view.setTranslationY(C36441kJ.A02(view));
            C012005e.A07(this.A09).A06(0.0f);
        }
    }

    private void A03() {
        C162847pF r4 = new C162847pF(this.A12.A0K(this.A0I), this);
        Handler handler = this.A0v;
        Runnable runnable = this.A15;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A03);
        this.A14.A02(r4);
    }

    public static void A05(C142466ov r4) {
        r4.A19.clear();
        r4.A0u.A06();
        r4.A0E((AnonymousClass6N8) null);
        if (r4.A0o != null) {
            r4.A0E.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = r4.A0F;
            if (bottomSheetBehavior.A0J != 4) {
                bottomSheetBehavior.A0W(4);
                A0D(r4, true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = r4.A0G;
            if (bottomSheetBehavior2.A0J != 5) {
                bottomSheetBehavior2.A0W(5);
            } else {
                A09(r4, 0.0f, true);
            }
        } else {
            r4.A09.clearAnimation();
            C012005e.A07(r4.A09).A06(C36441kJ.A02(r4.A09));
        }
        r4.A0S();
    }

    public static void A06(C142466ov r3) {
        r3.A1D.A0H(new C1503074t(r3, 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C142466ov r9) {
        /*
            long r3 = r9.A04
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 0
            r1.setOnClickListener(r0)
            X.1P5 r1 = r9.A12
            X.11F r0 = r9.A0I
            boolean r0 = r1.A0f(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = r9.A0T
            if (r0 != 0) goto L_0x0067
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131890804(0x7f121274, float:1.941631E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 22
        L_0x002a:
            X.C48752hz.A00(r1, r9, r0)
        L_0x002d:
            android.view.View r0 = r9.A0B
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 == 0) goto L_0x0049
            android.view.View r0 = r9.A0B
            r0.setVisibility(r3)
            android.view.View r2 = r9.A0B
            android.app.Activity r1 = r9.A05
            r0 = 2130771983(0x7f01000f, float:1.7147072E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r2.startAnimation(r0)
        L_0x0049:
            java.util.List r0 = r9.A17
            int r1 = r0.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0053
            r3 = 1
        L_0x0053:
            com.whatsapp.location.DragBottomSheetIndicator r2 = r9.A0J
            if (r2 == 0) goto L_0x0066
            r1 = 8
            r0 = 8
            if (r3 == 0) goto L_0x005e
            r0 = 4
        L_0x005e:
            r2.setVisibility(r0)
            android.view.View r0 = r9.A08
            r0.setVisibility(r1)
        L_0x0066:
            return
        L_0x0067:
            X.11F r0 = r9.A0I
            boolean r0 = r1.A0f(r0)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x0080
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131890804(0x7f121274, float:1.941631E38)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 23
            goto L_0x002a
        L_0x0080:
            java.util.Set r1 = r9.A1B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e2
            monitor-enter(r1)
            java.util.ArrayList r0 = X.C36441kJ.A15(r1)     // Catch:{ all -> 0x0132 }
            r1.clear()     // Catch:{ all -> 0x0132 }
            monitor-exit(r1)     // Catch:{ all -> 0x0132 }
            int r8 = r0.size()
            r7 = 0
            r6 = 1
            if (r8 != r6) goto L_0x00cd
            X.16D r1 = r9.A0y
            java.lang.Object r0 = r0.get(r7)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r1 = r1.A08(r0)
            if (r1 == 0) goto L_0x00cd
            X.171 r0 = r9.A0z
            java.lang.String r3 = r0.A0M(r1)
            com.whatsapp.TextEmojiLabel r2 = r9.A0q
            android.app.Activity r1 = r9.A05
            r0 = 2131890822(0x7f121286, float:1.9416347E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r3, r6, r0)
            r2.A0I(r0)
        L_0x00bb:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 + r2
            r9.A04 = r0
            android.os.Handler r1 = r9.A0v
            java.lang.Runnable r0 = r9.A1T
            r1.postDelayed(r0, r2)
            goto L_0x002d
        L_0x00cd:
            com.whatsapp.TextEmojiLabel r5 = r9.A0q
            X.0ts r4 = r9.A11
            r3 = 2131755185(0x7f1000b1, float:1.9141242E38)
            long r1 = (long) r8
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass000.A1L(r0, r8, r7)
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            r5.setText(r0)
            goto L_0x00bb
        L_0x00e2:
            java.util.List r2 = r9.A17
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00f4
            com.whatsapp.TextEmojiLabel r1 = r9.A0q
            r0 = 2131890808(0x7f121278, float:1.9416318E38)
            r1.setText(r0)
            goto L_0x002d
        L_0x00f4:
            android.view.View r0 = r9.A0B
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 != 0) goto L_0x0114
            android.view.View r0 = r9.A0B
            r0.setVisibility(r3)
            android.app.Activity r1 = r9.A05
            r0 = 2130771980(0x7f01000c, float:1.7147065E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r0 = 1
            X.C162657ow.A00(r1, r9, r0)
            android.view.View r0 = r9.A0B
            r0.startAnimation(r1)
        L_0x0114:
            int r1 = r2.size()
            r0 = 2
            boolean r2 = X.C90474aD.A1T(r1, r0)
            com.whatsapp.location.DragBottomSheetIndicator r1 = r9.A0J
            if (r1 == 0) goto L_0x0066
            int r0 = X.C36381kD.A09(r2)
            r1.setVisibility(r0)
            android.view.View r0 = r9.A08
            if (r2 != 0) goto L_0x012e
            r3 = 8
        L_0x012e:
            r0.setVisibility(r3)
            return
        L_0x0132:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0132 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142466ov.A07(X.6ov):void");
    }

    public static void A08(C142466ov r4, float f, boolean z) {
        r4.A0Z = f;
        if (r4.A0J.getVisibility() != 8) {
            r4.A0Z -= C36341k9.A00(r4.A05) * 20.0f;
        }
        float f2 = r4.A0Z;
        float max = Math.max(f2, r4.A0b);
        r4.A0m.setTranslationY(-f2);
        r4.A0T(max, z);
    }

    public static void A09(C142466ov r1, float f, boolean z) {
        r1.A0b = f;
        r1.A0T(Math.max(r1.A0Z, f), z);
    }

    public static void A0B(C142466ov r2, C63593Kq r3) {
        Map map = r2.A1A;
        synchronized (map) {
            map.put(r3.A06, r3);
        }
        r2.A0v.postDelayed(r2.A16, 3000);
    }

    public static void A0C(C142466ov r17, String str) {
        ArrayList A0I2;
        C63593Kq r0;
        C142466ov r11 = r17;
        if (r11.A0O != null) {
            List list = r11.A17;
            list.clear();
            list.add(r11.A0O);
        } else {
            List list2 = r11.A17;
            list2.clear();
            AnonymousClass1P5 r8 = r11.A12;
            AnonymousClass11F r1 = r11.A0I;
            synchronized (r8.A0Q) {
                Map A152 = C90514aH.A15(r1, AnonymousClass1P5.A05(r8));
                long A002 = C19970wo.A00(r8.A0D);
                A0I2 = AnonymousClass001.A0I();
                if (A152 != null) {
                    Iterator A0z2 = AnonymousClass000.A0z(A152);
                    while (A0z2.hasNext()) {
                        AnonymousClass375 r5 = (AnonymousClass375) A0z2.next();
                        if (AnonymousClass1P5.A0G(r5.A00, A002) && (r0 = (C63593Kq) r8.A0Z.get(r5.A01)) != null) {
                            A0I2.add(r0);
                        }
                    }
                }
            }
            list2.addAll(A0I2);
            if (r8.A0f(r11.A0I)) {
                if (r11.A0P == null) {
                    C19730wQ r02 = r11.A0x;
                    r02.A0G();
                    AnonymousClass142 r03 = r02.A0E;
                    C18740tg.A06(r03);
                    UserJid userJid = (UserJid) r03.A0H;
                    C18740tg.A06(userJid);
                    r11.A0P = new C63593Kq(userJid);
                    C237019m r10 = r11.A0w;
                    String str2 = str;
                    Location A022 = r10.A02(str2);
                    if (A022 != null) {
                        A04(A022, r11, r11.A0P);
                    }
                    r10.A06(r11, str2, 0.0f, 3, 5000, 1000);
                }
                list2.add(0, r11.A0P);
                return;
            }
        }
        r11.A0P = null;
        r11.A07 = null;
        r11.A0w.A05(r11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r14.A0e <= 2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r0 == 4) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C142466ov r14, boolean r15) {
        /*
            java.util.List r8 = r14.A17
            int r2 = r8.size()
            android.view.View r0 = r14.A0k
            if (r0 == 0) goto L_0x0010
            if (r15 != 0) goto L_0x0011
            int r0 = r14.A0e
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r5 = 2
            float r6 = (float) r2
            if (r2 <= r5) goto L_0x0017
            r6 = 1069547520(0x3fc00000, float:1.5)
        L_0x0017:
            r13 = 1
            r4 = 0
            boolean r12 = X.C90474aD.A1T(r2, r5)
            float r3 = r14.A0Y
            r9 = 0
            if (r12 == 0) goto L_0x00f1
            float r1 = r14.A0X
        L_0x0024:
            float r1 = r1 + r3
            X.3Kq r0 = r14.A0P
            if (r0 != 0) goto L_0x00ee
            X.3Kq r0 = r14.A0O
            if (r0 != 0) goto L_0x00ee
            float r0 = r14.A0d
            float r0 = r0 + r3
        L_0x0030:
            float r1 = r1 + r0
            int r1 = (int) r1
            float r0 = r14.A0a
            float r6 = r6 * r0
            float r7 = (float) r1
            float r6 = r6 + r7
            int r6 = (int) r6
            r11 = 0
            if (r2 == 0) goto L_0x00ea
            r11 = 1
            if (r2 <= r5) goto L_0x00ea
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.app.Activity r0 = r14.A05
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r3 = r1.heightPixels
            android.app.Activity r0 = r14.A05
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167364(0x7f070884, float:1.7949E38)
            float r1 = r1.getDimension(r0)
            int r3 = r3 / r5
            float r0 = (float) r3
            float r3 = java.lang.Math.min(r1, r0)
            float r1 = r14.A0a
            int r0 = r8.size()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r7
            float r0 = java.lang.Math.min(r1, r3)
            int r3 = (int) r0
            r10 = 0
            int r0 = r14.A0e
            if (r0 > r5) goto L_0x00ec
        L_0x0078:
            int r0 = r3 - r6
            float r7 = (float) r0
            android.view.View r0 = r14.A0B
            int r0 = r0.getVisibility()
            r5 = 4
            r8 = 8
            com.whatsapp.location.DragBottomSheetIndicator r1 = r14.A0J
            if (r0 != 0) goto L_0x00d9
            r0 = 8
            if (r12 == 0) goto L_0x008d
            r0 = 4
        L_0x008d:
            r1.setVisibility(r0)
            android.view.View r0 = r14.A08
            r0.setVisibility(r8)
        L_0x0095:
            android.view.View r0 = r14.A0k
            if (r11 == 0) goto L_0x00cd
            r0.setVisibility(r4)
            android.view.View r0 = r14.A0l
            r0.setVisibility(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            r0.A0Y(r6, r4)
            if (r13 == 0) goto L_0x00b9
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            r0.A0W(r5)
        L_0x00ad:
            float r0 = (float) r6
        L_0x00ae:
            A08(r14, r0, r4)
        L_0x00b1:
            android.view.View r0 = r14.A0k
            X.C36411kG.A1A(r0, r3)
        L_0x00b6:
            r14.A0e = r2
            return
        L_0x00b9:
            r1 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r14.A0F
            if (r10 == 0) goto L_0x00c4
            r0.A0W(r1)
            float r0 = (float) r6
            float r0 = r0 + r7
            goto L_0x00ae
        L_0x00c4:
            int r0 = r0.A0J
            if (r0 != r1) goto L_0x00ca
            float r0 = (float) r3
            goto L_0x00ae
        L_0x00ca:
            if (r0 != r5) goto L_0x00b1
            goto L_0x00ad
        L_0x00cd:
            r0.setVisibility(r8)
            android.view.View r0 = r14.A0l
            r0.setVisibility(r8)
            A08(r14, r9, r4)
            goto L_0x00b6
        L_0x00d9:
            int r0 = X.C36381kD.A09(r12)
            r1.setVisibility(r0)
            android.view.View r1 = r14.A08
            int r0 = X.C36381kD.A09(r12)
            r1.setVisibility(r0)
            goto L_0x0095
        L_0x00ea:
            r3 = r6
            r10 = 1
        L_0x00ec:
            r13 = 0
            goto L_0x0078
        L_0x00ee:
            r0 = 0
            goto L_0x0030
        L_0x00f1:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142466ov.A0D(X.6ov, boolean):void");
    }

    public static boolean A0F(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d - latLng2.A00 > 80.0d) {
            return false;
        }
        double d2 = latLng2.A01 - latLng.A01;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d2 <= 90.0d) {
            return true;
        }
        return false;
    }

    public LatLng A0I() {
        double latitude;
        double longitude;
        if (this.A0r != null) {
            Iterator it = this.A17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C63593Kq r5 = (C63593Kq) it.next();
                if (r5 != null && r5.A05 > 0 && r5.A06.equals(this.A0r)) {
                    latitude = r5.A00;
                    longitude = r5.A01;
                    break;
                }
            }
        }
        Location A022 = this.A0w.A02("group-chat-live-location-ui");
        if (A022 == null) {
            return null;
        }
        latitude = A022.getLatitude();
        longitude = A022.getLongitude();
        return C90524aI.A0F(latitude, longitude);
    }

    public AnonymousClass6N8 A0K(C63593Kq r6) {
        if (r6 == null) {
            return null;
        }
        for (AnonymousClass6N8 r3 : this.A18) {
            List list = r3.A04;
            if (list.size() > 1 && list.contains(r6)) {
                return r3;
            }
        }
        return null;
    }

    public String A0M(AnonymousClass6N8 r10) {
        List<C63593Kq> list = r10.A04;
        if (list.size() == 1 && this.A0x.A0M(((C63593Kq) list.get(0)).A06)) {
            return this.A05.getString(R.string.f12nameremoved);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (C63593Kq r0 : list) {
            A0I2.add(r0.A06);
        }
        C18820ts r6 = this.A11;
        long size = (long) A0I2.size();
        return r6.A0L(new Object[]{r6.A0G(this.A0z.A0W(A0I2, 3))}, R.plurals.f10nameremoved, size);
    }

    public void A0P() {
        this.A0H.A02();
        this.A1J.unregisterObserver(this.A1I);
        this.A1O.unregisterObserver(this.A1N);
        this.A1G.unregisterObserver(this.A1F);
        this.A1Q.unregisterObserver(this.A1P);
    }

    public void A0Q() {
        this.A1E.unregisterObserver(this);
        this.A04 = 0;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A15);
        AnonymousClass1PA r6 = this.A14;
        AnonymousClass11F r9 = this.A0I;
        AnonymousClass75J r5 = new AnonymousClass75J(r9);
        AnonymousClass19A r10 = r6.A01;
        String A092 = r10.A09();
        C36321k7.A1Q("LocationSubscriptionSendMethods/unsubscribe; iqId=", A092, AnonymousClass000.A0u());
        C203399nx r7 = new C203399nx("unsubscribe", (AnonymousClass1AL[]) null);
        ArrayList A142 = C36441kJ.A14(5);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092, A142);
        C36381kD.A1M("xmlns", "location", A142);
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A142);
        String str = "to";
        if (r6.A00.A0E(4177)) {
            A142.add(new AnonymousClass1AL((Jid) C177588e2.A00, str));
            str = "target";
        }
        A142.add(new AnonymousClass1AL((Jid) r9, str));
        r10.A0E(new C165337tG(r5, r6, r5, 2), C36391kE.A0m(r7, (AnonymousClass1AL[]) A142.toArray(AnonymousClass1PA.A05)), A092, 83, 32000);
        handler.removeCallbacks(this.A1T);
        handler.removeCallbacks(this.A16);
        this.A0w.A05(this);
        this.A07 = null;
        this.A05.unregisterReceiver(this.A0g);
        AnonymousClass1P5 r2 = this.A12;
        r2.A0U.remove(this.A1S);
        r2.A0T.remove(this.A1R);
    }

    public void A0U(Activity activity, Bundle bundle) {
        this.A05 = activity;
        this.A0a = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A0c = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A0X = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A0d = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A0Y = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A01 = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A02 = activity.getResources().getDimension(R.dimen.f7nameremoved);
        this.A0H = this.A1K.A05(activity, "group-chat-live-locations-ui");
        String stringExtra = activity.getIntent().getStringExtra("jid");
        C222713q r3 = AnonymousClass11F.A00;
        AnonymousClass11F A022 = r3.A02(stringExtra);
        C18740tg.A06(A022);
        this.A0I = A022;
        String stringExtra2 = activity.getIntent().getStringExtra("target");
        C222813r r2 = UserJid.Companion;
        this.A0r = r2.A02(stringExtra2);
        UserJid A023 = r2.A02(activity.getIntent().getStringExtra("final_location_jid"));
        long longExtra = activity.getIntent().getLongExtra("final_location_timestamp", 0);
        if (A023 != null && longExtra > 0) {
            C63593Kq r6 = new C63593Kq(A023);
            this.A0O = r6;
            r6.A05 = longExtra;
            r6.A00 = activity.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
            this.A0O.A01 = activity.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
        }
        this.A0S = this.A0w.A07();
        A0C(this, "group-chat-live-location-ui-oncreate");
        this.A0D = (RecyclerView) activity.findViewById(R.id.user_list);
        this.A0k = activity.findViewById(R.id.list_holder);
        this.A0J = (DragBottomSheetIndicator) activity.findViewById(R.id.drag_indicator);
        this.A0m = activity.findViewById(R.id.map_bottom);
        this.A0l = activity.findViewById(R.id.list_holder_shadow);
        View view = this.A0k;
        int i = 8;
        if (view != null) {
            view.setVisibility(8);
            this.A0l.setVisibility(8);
            this.A0J.setVisibility(8);
            this.A0F = new C99234ss(this);
            BottomSheetBehavior bottomSheetBehavior = this.A0F;
            ((C02460Ak) this.A0k.getLayoutParams()).A00(bottomSheetBehavior);
            bottomSheetBehavior.A0d(false);
            this.A0F.A0a(new C89194Vp(this, 8));
            this.A08 = activity.findViewById(R.id.drag_indicator_click);
            C48752hz r1 = new C48752hz(this, 24);
            this.A0J.setOnClickListener(r1);
            this.A08.setOnClickListener(r1);
        }
        this.A0A = activity.findViewById(R.id.selected_list_title_holder);
        this.A0p = (TextView) activity.findViewById(R.id.selected_list_title);
        this.A0E = (RecyclerView) activity.findViewById(R.id.selected_list);
        C48752hz.A00(activity.findViewById(R.id.selected_cancel), this, 25);
        this.A0o = activity.findViewById(R.id.selected_list_holder);
        View findViewById = activity.findViewById(R.id.landscape_selected_list_holder);
        this.A09 = findViewById;
        View view2 = this.A0o;
        if (view2 != null) {
            BottomSheetBehavior A024 = BottomSheetBehavior.A02(view2);
            this.A0G = A024;
            A024.A0a(new C89194Vp(this, 9));
            BottomSheetBehavior bottomSheetBehavior2 = this.A0G;
            bottomSheetBehavior2.A0h = true;
            bottomSheetBehavior2.A0W(5);
        } else {
            findViewById.getViewTreeObserver().addOnPreDrawListener(new C163987r5(this, 2));
        }
        this.A06 = AnonymousClass00E.A00(activity, R.drawable.live_location_list_divider);
        C96234n0 r22 = new C96234n0(this);
        List<C63593Kq> list = this.A17;
        this.A0K = new C95964mZ(this, list, false);
        C36351kA.A1F(this.A0D, 1);
        this.A0D.setAdapter(this.A0K);
        RecyclerView recyclerView = this.A0D;
        recyclerView.A0U = true;
        recyclerView.A0t(r22);
        List list2 = this.A19;
        this.A0u = new C95964mZ(this, list2, true);
        C36351kA.A1F(this.A0E, 1);
        this.A0E.setAdapter(this.A0u);
        RecyclerView recyclerView2 = this.A0E;
        recyclerView2.A0U = true;
        recyclerView2.A0t(r22);
        this.A0q = (TextEmojiLabel) activity.findViewById(R.id.status);
        this.A0B = activity.findViewById(R.id.status_panel);
        A0D(this, true);
        this.A1O.registerObserver(this.A1N);
        this.A1J.registerObserver(this.A1I);
        this.A1G.registerObserver(this.A1F);
        this.A1Q.registerObserver(this.A1P);
        View inflate = View.inflate(this.A05, R.layout.f9nameremoved, (ViewGroup) null);
        this.A0j = inflate;
        ContactLiveLocationThumbnail contactLiveLocationThumbnail = (ContactLiveLocationThumbnail) inflate.findViewById(R.id.contact_photo);
        this.A0s = contactLiveLocationThumbnail;
        AnonymousClass1Pp r11 = this.A1H;
        this.A0h = AnonymousClass1Pp.A01(contactLiveLocationThumbnail.getContext(), r11, 0.0f, R.drawable.avatar_contact, activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A0i = AnonymousClass1Pp.A01(this.A0s.getContext(), r11, 0.0f, R.drawable.avatar_contact, activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A0j.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0j.layout(0, 0, this.A0j.getMeasuredWidth(), this.A0j.getMeasuredHeight());
        View inflate2 = View.inflate(this.A05, R.layout.f9nameremoved, (ViewGroup) null);
        this.A0n = inflate2;
        this.A0t = (ContactLiveLocationThumbnail) inflate2.findViewById(R.id.contact_photo);
        this.A0n.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0f = this.A0n.getMeasuredWidth();
        int measuredHeight = this.A0n.getMeasuredHeight();
        this.A00 = measuredHeight;
        this.A0n.layout(0, 0, this.A0f, measuredHeight);
        if (bundle != null) {
            this.A0U = bundle.getBoolean("map_follow_user", false);
            this.A0W = bundle.getBoolean("map_touched", false);
            AnonymousClass11F A025 = r3.A02(bundle.getString("selected_user_jid"));
            if (A025 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C63593Kq r12 = (C63593Kq) it.next();
                    if (r12.A06.equals(A025)) {
                        this.A0Q = r12;
                        break;
                    }
                }
            }
            HashSet A162 = C36441kJ.A16();
            AnonymousClass143.A0B(UserJid.class, bundle.getStringArrayList("selected_user_jids"), A162);
            if (!A162.isEmpty()) {
                for (C63593Kq r13 : list) {
                    if (A162.contains(r13.A06)) {
                        list2.add(r13);
                    }
                }
                Collections.sort(list2, new C81463x3(this.A0x, this.A0y, this.A0z));
                this.A0u.A06();
                A02();
            }
        }
        View findViewById2 = activity.findViewById(R.id.zoom_out);
        this.A0C = findViewById2;
        C48752hz.A00(findViewById2, this, 26);
        View view3 = this.A0C;
        if (this.A0W && this.A0O == null) {
            i = 0;
        }
        view3.setVisibility(i);
        this.A0M = new C122565v3(this.A13, new C81463x3(this.A0x, this.A0y, this.A0z), (float) this.A0f, (float) this.A00);
        LocationSharingService.A02(activity.getApplicationContext(), this.A12);
    }

    public void A0V(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0U);
        bundle.putBoolean("map_touched", this.A0W);
        C63593Kq r0 = this.A0Q;
        if (r0 != null) {
            bundle.putString("selected_user_jid", r0.A06.getRawString());
        }
        List<C63593Kq> list = this.A19;
        if (!list.isEmpty()) {
            ArrayList A0r2 = C36361kB.A0r(list);
            for (C63593Kq r02 : list) {
                A0r2.add(r02.A06.getRawString());
            }
            bundle.putStringArrayList("selected_user_jids", A0r2);
        }
    }

    public void A0X(C131126Nv r12) {
        List<C63593Kq> list;
        AnonymousClass6N8 r1;
        C122565v3 r5 = this.A0M;
        C63593Kq r0 = this.A0O;
        if (r0 != null) {
            list = Collections.singletonList(r0);
        } else {
            long A002 = C19970wo.A00(this.A10);
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (C63593Kq r4 : this.A17) {
                if (r4 != null && (r4.A05 + 86400000 > A002 || this.A0x.A0M(r4.A06))) {
                    A0I2.add(r4);
                }
            }
            list = A0I2;
        }
        C63593Kq r42 = this.A0Q;
        List list2 = this.A19;
        ArrayList A0I3 = AnonymousClass001.A0I();
        for (C63593Kq r6 : list) {
            C36341k9.A1H(r6, r12.A00(C90524aI.A0F(r6.A00, r6.A01)), A0I3);
        }
        Collections.sort(A0I3, AnonymousClass763.A00);
        ArrayList A0I4 = AnonymousClass001.A0I();
        Iterator it = A0I3.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            AnonymousClass00I r3 = (AnonymousClass00I) it.next();
            if (r3.A00 != r42) {
                float f = ((float) i) + r5.A00;
                int i2 = ((Point) r3.A01).x;
                if (f < ((float) i2)) {
                    A0I4.add(C90484aE.A0r(r3));
                    i = i2;
                } else {
                    ((List) A0I4.get(C90504aG.A0C(A0I4))).add(r3);
                }
            }
        }
        ArrayList A0I5 = AnonymousClass001.A0I();
        Iterator it2 = A0I4.iterator();
        while (it2.hasNext()) {
            List<AnonymousClass00I> list3 = (List) it2.next();
            Collections.sort(list3, AnonymousClass764.A00);
            int i3 = Integer.MIN_VALUE;
            for (AnonymousClass00I r13 : list3) {
                Object obj = r13.A00;
                if (obj != r42) {
                    float f2 = ((float) i3) + r5.A01;
                    int i4 = ((Point) r13.A01).y;
                    if (f2 < ((float) i4)) {
                        A0I5.add(C90484aE.A0r(obj));
                        i3 = i4;
                    } else {
                        ((List) A0I5.get(C90504aG.A0C(A0I5))).add(obj);
                    }
                }
            }
        }
        if (r42 != null) {
            A0I5.add(C90484aE.A0r(r42));
        }
        ArrayList A0I6 = AnonymousClass001.A0I();
        Iterator it3 = A0I5.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            Collections.sort(list4, r5.A03);
            A0I6.add(new AnonymousClass6N8(r5.A02, list4, 0));
        }
        List<AnonymousClass6N8> list5 = this.A18;
        synchronized (list5) {
            list5.clear();
            list5.addAll(A0I6);
            int i5 = 0;
            int i6 = 1;
            if (this.A0O != null) {
                list5.clear();
                C63593Kq r14 = this.A0O;
                if (this.A0Q != null) {
                    i5 = 1;
                }
                list5.add(new AnonymousClass6N8(r14, i5));
            } else if (!list2.isEmpty()) {
                AnonymousClass6N8 r43 = null;
                for (AnonymousClass6N8 r2 : list5) {
                    List list6 = r2.A04;
                    ArrayList A152 = C36441kJ.A15(list2);
                    A152.retainAll(list6);
                    if (A152.size() > i6) {
                        i6 = A152.size();
                        r43 = r2;
                    }
                }
                if (r43 != null) {
                    A0W(r43, false);
                } else {
                    A0O();
                }
            } else {
                C63593Kq r32 = this.A0Q;
                if (r32 != null) {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            r1 = null;
                            break;
                        }
                        r1 = (AnonymousClass6N8) it4.next();
                        if (r1.A02 == r32) {
                            break;
                        }
                    }
                    A0E(r1);
                }
            }
        }
    }

    public void A0Y(Float f) {
        C119675qG r5 = this.A0L;
        if (r5 == null) {
            return;
        }
        if (f == null || ((double) C90494aF.A01(r5.A00, f.floatValue())) <= 0.05d) {
            String A012 = A01(r5.A01);
            this.A0L = null;
            for (AnonymousClass6N8 r1 : this.A18) {
                if (A012.equals(A01(r1.A04))) {
                    A0W(r1, false);
                    return;
                }
            }
        }
    }

    public boolean A0Z(int i, int i2) {
        Activity activity = this.A05;
        if (activity != null) {
            LocationSharingService.A02(activity.getApplicationContext(), this.A12);
        }
        if (i == 34) {
            if (i2 != -1) {
                return false;
            }
            this.A13.A06(this.A05, this.A0I);
        } else if (i != 100) {
            return false;
        } else {
            if (i2 == 1000) {
                C24801Dv r3 = this.A1C;
                Activity activity2 = this.A05;
                r3.A07(activity2, C36441kJ.A0j().A1Y(activity2, this.A0I));
                this.A05.finish();
                return true;
            }
        }
        return true;
    }

    public void onLocationChanged(Location location) {
        if (AnonymousClass1P6.A01(location, this.A07)) {
            this.A07 = location;
            C63593Kq r0 = this.A0P;
            if (r0 != null) {
                A04(location, this, r0);
                this.A0K.A06();
                if (this.A0R) {
                    this.A0R = false;
                } else {
                    A0B(this, this.A0P);
                    return;
                }
            } else if (!this.A12.A0f(this.A0I)) {
                return;
            }
            A06(this);
        }
    }

    public C142466ov(C24801Dv r5, C237019m r6, AnonymousClass17Y r7, C19730wQ r8, AnonymousClass19J r9, C24361Cd r10, AnonymousClass1Pp r11, AnonymousClass16D r12, AnonymousClass16I r13, AnonymousClass171 r14, C27731Pn r15, C27761Ps r16, C19970wo r17, C20830yE r18, C18820ts r19, AnonymousClass16J r20, C233117z r21, AnonymousClass1P5 r22, AnonymousClass2XH r23, AnonymousClass1PA r24) {
        this.A10 = r17;
        this.A1D = r7;
        this.A0x = r8;
        this.A1C = r5;
        this.A1K = r15;
        this.A13 = r23;
        this.A1H = r11;
        this.A0y = r12;
        this.A0z = r14;
        this.A11 = r19;
        this.A1J = r13;
        this.A1O = r20;
        this.A1E = r9;
        this.A1G = r10;
        this.A0w = r6;
        C20830yE r1 = r18;
        this.A1M = r1;
        this.A12 = r22;
        this.A0T = r1.A05();
        this.A1L = r16;
        this.A1Q = r21;
        this.A14 = r24;
    }

    public static String A01(List list) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I2.add(((C63593Kq) it.next()).A06.getRawString());
        }
        Collections.sort(A0I2);
        return TextUtils.join("|", A0I2);
    }

    public static void A04(Location location, C142466ov r4, C63593Kq r5) {
        r5.A00 = location.getLatitude();
        r4.A0P.A01 = location.getLongitude();
        r4.A0P.A05 = location.getTime();
        r4.A0P.A02 = location.getSpeed();
        r4.A0P.A03 = (int) location.getAccuracy();
        r4.A0P.A04 = (int) location.getBearing();
    }

    private void A0E(AnonymousClass6N8 r10) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        List<AnonymousClass6N8> list = this.A18;
        synchronized (list) {
            if (r10 == null) {
                this.A0N = null;
                for (AnonymousClass6N8 r0 : list) {
                    A0I2.add(new AnonymousClass6N8(this.A13, r0.A04, 0));
                }
            } else {
                for (AnonymousClass6N8 r4 : list) {
                    if (r4 == r10) {
                        A0I2.add(new AnonymousClass6N8(this.A13, r4.A04, 1));
                        this.A0N = r4;
                    } else {
                        A0I2.add(new AnonymousClass6N8(this.A13, r4.A04, 2));
                    }
                }
            }
            list.clear();
            list.addAll(A0I2);
            this.A0V = false;
        }
    }

    public Bitmap A0G(AnonymousClass6N8 r22) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z;
        boolean z2;
        Bitmap A012;
        Activity activity;
        int i;
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass6N8 r8 = r22;
        int i2 = r8.A00;
        float f = 1.0f;
        if (i2 == 1) {
            contactLiveLocationThumbnail = this.A0t;
            view = this.A0n;
            list = r8.A04;
            if (list.size() == 1) {
                AnonymousClass141 A0D2 = this.A0y.A0D(((C63593Kq) list.get(0)).A06);
                C27761Ps r13 = this.A1L;
                Activity activity2 = this.A05;
                AnonymousClass141 r15 = A0D2;
                Activity activity3 = activity2;
                Bitmap A072 = r13.A07(activity3, r15, this.A05.getResources().getDimension(R.dimen.f7nameremoved), activity2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
                if (A072 == null) {
                    AnonymousClass1Pp r11 = this.A1H;
                    A072 = r11.A03(contactLiveLocationThumbnail.getContext(), r11.A02(A0D2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                A0I2.add(A072);
            } else {
                for (int i3 = 0; i3 < Math.min(list.size(), 4); i3++) {
                    AnonymousClass141 A0D3 = this.A0y.A0D(((C63593Kq) list.get(i3)).A06);
                    C27761Ps r14 = this.A1L;
                    Activity activity4 = this.A05;
                    Bitmap A073 = r14.A07(activity4, A0D3, 0.0f, activity4.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
                    if (A073 == null) {
                        A073 = this.A0i;
                    }
                    A0I2.add(A073);
                }
                z2 = false;
            }
        } else {
            contactLiveLocationThumbnail = this.A0s;
            view = this.A0j;
            list = r8.A04;
            if (list.size() == 1) {
                AnonymousClass141 A0D4 = this.A0y.A0D(((C63593Kq) list.get(0)).A06);
                C27761Ps r152 = this.A1L;
                Activity activity5 = this.A05;
                AnonymousClass141 r17 = A0D4;
                Activity activity6 = activity5;
                Bitmap A074 = r152.A07(activity6, r17, C90494aF.A04(this.A05), activity5.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
                if (A074 == null) {
                    AnonymousClass1Pp r132 = this.A1H;
                    A074 = r132.A03(contactLiveLocationThumbnail.getContext(), r132.A02(A0D4));
                    z = true;
                } else {
                    z = false;
                }
                A0I2.add(A074);
            } else {
                for (int i4 = 0; i4 < Math.min(list.size(), 4); i4++) {
                    AnonymousClass141 A0D5 = this.A0y.A0D(((C63593Kq) list.get(i4)).A06);
                    Activity activity7 = this.A05;
                    Bitmap A075 = this.A1L.A07(activity7, A0D5, 0.0f, activity7.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
                    if (A075 == null) {
                        A075 = this.A0h;
                    }
                    A0I2.add(A075);
                }
                z = false;
            }
            if (i2 == 2) {
                f = 0.3f;
            }
        }
        contactLiveLocationThumbnail.setAlpha(f);
        if (A0I2.size() == 1) {
            A012 = (Bitmap) A0I2.get(0);
        } else {
            A012 = C27731Pn.A01(A0I2, 0.0f);
        }
        contactLiveLocationThumbnail.setImageBitmap(A012);
        int i5 = r8.A01;
        if (i5 == 0) {
            activity = this.A05;
            i = C224514j.A00(activity, R.attr.f4nameremoved, R.color.f6nameremoved);
            contactLiveLocationThumbnail.A00 = AnonymousClass00F.A00(activity, i);
        } else if (i5 != 1) {
            contactLiveLocationThumbnail.A00 = 0;
        } else {
            activity = this.A05;
            i = R.color.f6nameremoved;
            contactLiveLocationThumbnail.A00 = AnonymousClass00F.A00(activity, i);
        }
        contactLiveLocationThumbnail.A02 = z2;
        contactLiveLocationThumbnail.A01 = list.size();
        Bitmap A092 = C90524aI.A09(view.getWidth(), view.getHeight());
        view.draw(C90524aI.A0A(A092));
        return A092;
    }

    public AnonymousClass6N8 A0J(LatLng latLng) {
        LatLng A032;
        LatLng A033;
        C131126Nv A0L2 = A0L();
        if (A0L2 != null) {
            Point A002 = A0L2.A00(latLng);
            Point point = new Point(A002.x - (this.A0f / 2), A002.y - (this.A00 / 2));
            Point point2 = new Point(A002.x + (this.A0f / 2), A002.y + (this.A00 / 2));
            AnonymousClass67D r3 = new AnonymousClass67D();
            AnonymousClass68Y r4 = A0L2.A01;
            if (r4 != null) {
                A032 = r4.A01(point);
            } else {
                A032 = C134976bv.A03(A0L2.A00.A05((float) point.x, (float) point.y));
            }
            r3.A01(A032);
            if (r4 != null) {
                A033 = r4.A01(point2);
            } else {
                A033 = C134976bv.A03(A0L2.A00.A05((float) point2.x, (float) point2.y));
            }
            r3.A01(A033);
            LatLngBounds A003 = r3.A00();
            for (AnonymousClass6N8 r1 : this.A18) {
                if (A003.A00(r1.A00())) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A0W(AnonymousClass6N8 r6, boolean z) {
        A0E(r6);
        List list = r6.A04;
        if (list.size() == 1) {
            A0A(this, (C63593Kq) C36391kE.A0t(list));
            return;
        }
        this.A0Q = null;
        List list2 = this.A19;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new C81463x3(this.A0x, this.A0y, this.A0z));
        this.A0u.A06();
        A02();
        if (z) {
            A06(this);
        }
    }

    public void BYl() {
        A03();
    }

    public static double A00(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }
}
