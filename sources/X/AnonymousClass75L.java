package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.75L  reason: invalid class name */
public abstract class AnonymousClass75L implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass75L)) {
            return false;
        }
        AnonymousClass75L r7 = (AnonymousClass75L) obj;
        if (this.A00 == r7.A00) {
            String str = this.A02;
            String str2 = r7.A02;
            if (str != null ? str.equals(str2) : str2 == null) {
                if (this.A01 == r7.A01) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        Delayed delayed = (Delayed) obj;
        if (delayed instanceof AnonymousClass75L) {
            AnonymousClass75L r10 = (AnonymousClass75L) delayed;
            long j = this.A01;
            long j2 = r10.A01;
            if (j != j2 ? j - j2 < 0 : this.A00 - r10.A00 > 0) {
                return -1;
            }
            if (i != 0) {
                return 1;
            }
            return 0;
        }
        throw AnonymousClass001.A08("Comparing a Dispatchable to a non-Dispatchable.");
    }

    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x047e, code lost:
        if (r2 != null) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019e, code lost:
        if (r3.A0G.A05() != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C97764qE
            if (r0 == 0) goto L_0x001a
            r0 = r13
            X.4qE r0 = (X.C97764qE) r0
            X.6VI r1 = r0.A00
            boolean r0 = X.AnonymousClass6VI.A0C
            r0 = 0
            r1.A0B = r0
            X.6VI r0 = r1.A06
            if (r0 != 0) goto L_0x0019
            X.6VI r0 = r1.A07
            if (r0 != 0) goto L_0x0019
            r1.A03()
        L_0x0019:
            return
        L_0x001a:
            boolean r0 = r13 instanceof X.C97724qA
            if (r0 == 0) goto L_0x0024
            java.util.Vector r3 = X.AnonymousClass6P6.A02
            monitor-enter(r3)
            r2 = 0
            goto L_0x0506
        L_0x0024:
            boolean r0 = r13 instanceof X.C97714q9
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = X.AnonymousClass6UZ.A08
            java.util.ListIterator r1 = r0.listIterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r1.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.7c4 r0 = (X.AnonymousClass7c4) r0
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = (android.view.View) r0
            r0.invalidate()
            goto L_0x002e
        L_0x0048:
            r1.remove()
            goto L_0x002e
        L_0x004c:
            boolean r0 = r13 instanceof X.C97754qD
            if (r0 == 0) goto L_0x0067
            r0 = r13
            X.4qD r0 = (X.C97754qD) r0
            X.5zQ r1 = r0.A00
            r0 = 0
            r1.A0Q = r0
            X.7c3 r2 = r1.A0L
            X.4ej r2 = (X.C92794ej) r2
            X.7mO r1 = r2.A0S
            java.lang.String r0 = "gesture_single_long_tap"
            r1.Bpr(r0)
            X.C92794ej.A07(r2)
            return
        L_0x0067:
            boolean r0 = r13 instanceof X.C97744qC
            if (r0 == 0) goto L_0x0466
            r0 = r13
            X.4qC r0 = (X.C97744qC) r0
            X.5zQ r0 = r0.A00
            X.7c3 r4 = r0.A0L
            float r6 = r0.A09
            float r5 = r0.A0A
            X.4ej r4 = (X.C92794ej) r4
            X.C92794ej.A07(r4)
            X.6jP r2 = r4.A0O
            if (r2 == 0) goto L_0x03c2
            boolean r0 = r2 instanceof X.C97674q5
            if (r0 == 0) goto L_0x00ac
            X.4q5 r2 = (X.C97674q5) r2
            X.60l r1 = r2.A0B
            if (r1 == 0) goto L_0x03c2
            android.graphics.RectF r0 = r2.A0A
            boolean r0 = r0.contains(r6, r5)
            if (r0 == 0) goto L_0x03c2
            X.6sA r0 = r2.A02
            r1.A00(r0, r2)
        L_0x0096:
            X.6jV r3 = r4.A0M
            X.6jP r2 = r4.A0O
            X.6jP r1 = r3.A0E
            if (r1 == 0) goto L_0x00a9
            if (r1 == r2) goto L_0x00a9
            boolean r0 = r1 instanceof X.C97634q1
            if (r0 == 0) goto L_0x00a9
            X.4q1 r1 = (X.C97634q1) r1
            r1.A07()
        L_0x00a9:
            r3.A0E = r2
            return
        L_0x00ac:
            boolean r0 = r2 instanceof X.C97634q1
            if (r0 == 0) goto L_0x0239
            X.4q1 r2 = (X.C97634q1) r2
            X.6jV r5 = r2.A07
            java.lang.String r1 = "marker_click"
            X.4ej r0 = r5.A0Q
            X.7mO r0 = r0.A0S
            r0.Bpr(r1)
            boolean r0 = r2.A0H
            r6 = 1
            if (r0 == 0) goto L_0x0146
            X.6jV r0 = r2.A0D
            if (r0 == 0) goto L_0x0146
            X.7eN r1 = r0.A0B
            if (r1 == 0) goto L_0x0146
            X.7qP r1 = (X.C163567qP) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r1.A00
            com.whatsapp.location.LocationPicker r0 = (com.whatsapp.location.LocationPicker) r0
            X.6Zc r1 = r0.A0P
            int r0 = r2.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A0X(r0, r2)
            goto L_0x0096
        L_0x00e0:
            java.lang.Object r5 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r5
            java.lang.Object r0 = r2.A0F
            X.6N8 r0 = (X.AnonymousClass6N8) r0
            if (r0 == 0) goto L_0x0096
            X.0wQ r1 = r5.A02
            X.3Kq r0 = r0.A02
            com.whatsapp.jid.UserJid r8 = r0.A06
            boolean r0 = r1.A0M(r8)
            if (r0 != 0) goto L_0x0096
            X.6bv r1 = r2.A0E
            X.6jV r0 = r5.A05
            X.C18740tg.A06(r0)
            X.6WY r0 = r0.A0R
            android.graphics.Point r0 = r0.A04(r1)
            android.graphics.Rect r9 = X.AnonymousClass001.A06()
            int r1 = r0.x
            r9.left = r1
            int r0 = r0.y
            r9.top = r0
            r9.right = r1
            r9.bottom = r0
            X.6ov r7 = r5.A0N
            X.3Kq r2 = r7.A0O
            r3 = 0
            if (r2 == 0) goto L_0x0144
            double r0 = r2.A00
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            double r0 = r2.A01
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L_0x0126:
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.3Pd r1 = new X.3Pd
            r1.<init>((android.graphics.Rect) r9, (X.AnonymousClass11F) r8, (java.lang.Integer) r0)
            X.11F r0 = r7.A0I
            r1.A01 = r0
            r1.A05 = r6
            r1.A02 = r3
            r1.A03 = r2
            android.content.Intent r0 = r1.A01(r5)
            r5.startActivity(r0)
            goto L_0x0096
        L_0x0144:
            r2 = r3
            goto L_0x0126
        L_0x0146:
            X.6jV r0 = r2.A0D
            if (r0 == 0) goto L_0x0096
            X.7eP r1 = r0.A0D
            if (r1 == 0) goto L_0x0225
            X.7qQ r1 = (X.C163577qQ) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r3 = r1.A00
            com.whatsapp.location.LocationPicker r3 = (com.whatsapp.location.LocationPicker) r3
            X.6Zc r1 = r3.A0P
            boolean r0 = r1.A0i
            if (r0 != 0) goto L_0x0096
            int r0 = r2.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x0225
            com.whatsapp.location.PlaceInfo r0 = r1.A0V
            if (r0 == 0) goto L_0x0178
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0178
            X.4q1 r1 = (X.C97634q1) r1
            X.5hZ r0 = r3.A04
            r1.A09(r0)
            r1.A07()
        L_0x0178:
            X.5hZ r0 = r3.A05
            r2.A09(r0)
            X.6Zc r0 = r3.A0P
            r0.A0W(r2)
            X.6Zc r0 = r3.A0P
            android.view.View r0 = r0.A08
            r1 = 8
            r0.setVisibility(r1)
            X.6Zc r0 = r3.A0P
            android.view.View r0 = r0.A0B
            r0.setVisibility(r1)
            X.6Zc r0 = r3.A0P
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x01a0
            X.0yE r0 = r3.A0G
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0096
        L_0x01a0:
            r2.A08()
            goto L_0x0096
        L_0x01a5:
            java.lang.Object r7 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r7 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r7
            X.6ov r0 = r7.A0N
            r0.A0W = r6
            r8 = 0
            r0.A0U = r8
            android.view.View r3 = r0.A0C
            X.3Kq r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x01b9
            r0 = 0
        L_0x01b9:
            r3.setVisibility(r0)
            java.lang.Object r5 = r2.A0F
            boolean r0 = r5 instanceof X.AnonymousClass6N8
            if (r0 == 0) goto L_0x021e
            X.6N8 r5 = (X.AnonymousClass6N8) r5
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x01e2
            X.6ov r1 = r7.A0N
            java.util.List r0 = r5.A04
            java.lang.Object r0 = r0.get(r8)
            X.3Kq r0 = (X.C63593Kq) r0
            X.6N8 r5 = r1.A0K(r0)
            if (r5 == 0) goto L_0x021e
            java.lang.String r1 = r5.A03
            java.util.Map r0 = r7.A0S
            java.lang.Object r2 = r0.get(r1)
            X.4q1 r2 = (X.C97634q1) r2
        L_0x01e2:
            int r0 = r5.A00
            if (r0 == r6) goto L_0x021e
            java.util.List r3 = r5.A04
            int r0 = r3.size()
            if (r0 != r6) goto L_0x01f4
            X.6ov r0 = r7.A0N
            r0.A0W(r5, r6)
            goto L_0x01a0
        L_0x01f4:
            X.6jV r0 = r7.A05
            X.C18740tg.A06(r0)
            float r1 = X.C134996bx.A00(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x020a
            X.6ov r0 = r7.A0N
            r0.A0W(r5, r6)
            goto L_0x0096
        L_0x020a:
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0H(r7, r3, r6)
            X.6ov r2 = r7.A0N
            X.6jV r0 = r7.A05
            float r1 = X.C134996bx.A00(r0)
            X.5qG r0 = new X.5qG
            r0.<init>(r3, r1)
            r2.A0L = r0
            goto L_0x0096
        L_0x021e:
            X.6ov r0 = r7.A0N
            r0.A0O()
            goto L_0x0096
        L_0x0225:
            r2.A08()
            X.6bv r0 = r2.A0E
            X.64g r2 = new X.64g
            r2.<init>()
            r2.A06 = r0
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            r5.A0A(r2, r0, r1)
            goto L_0x0096
        L_0x0239:
            boolean r0 = r2 instanceof X.C97624q0
            if (r0 == 0) goto L_0x025d
            X.6jV r2 = r2.A07
            java.lang.String r1 = "my_location_button_click"
            X.4ej r0 = r2.A0Q
            X.7mO r0 = r0.A0S
            r0.Bpr(r1)
            X.6NI r0 = r2.A0U
            android.location.Location r0 = r0.A00
            if (r0 == 0) goto L_0x0096
            X.6bv r1 = X.C134976bv.A01(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            X.64g r1 = X.C1264964g.A00(r1, r0)
        L_0x0258:
            r2.A08(r1)
            goto L_0x0096
        L_0x025d:
            boolean r0 = r2 instanceof X.C97614pz
            if (r0 == 0) goto L_0x026c
            X.6jV r2 = r2.A07
            r0 = 0
            X.64g r1 = new X.64g
            r1.<init>()
            r1.A00 = r0
            goto L_0x0258
        L_0x026c:
            boolean r0 = r2 instanceof X.C97604py
            if (r0 == 0) goto L_0x03c2
            X.4py r2 = (X.C97604py) r2
            X.6jV r0 = r2.A07
            X.6bx r7 = r0.A02()
            X.4ej r1 = r0.A0Q
            X.6LS r3 = r2.A01
            android.content.Context r5 = r2.A06
            int r9 = r1.getWidth()
            int r8 = r1.getHeight()
            android.content.Context r0 = r0.A0O
            android.content.res.Resources r12 = r0.getResources()
            java.lang.String r6 = X.AnonymousClass6UZ.A04
            X.5yJ r0 = r1.A0N
            java.lang.String r0 = r0.A04
            X.6bA r2 = new X.6bA
            r2.<init>(r0)
            java.lang.String r0 = "InfoButtonDrawable.java"
            r2.A04 = r0
            X.6bv r11 = r7.A03
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            double r0 = r11.A00
            r10.append(r0)
            java.lang.String r0 = ","
            r10.append(r0)
            double r0 = r11.A01
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r2.A02 = r0
            float r0 = r7.A02
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0B = r0
            android.util.DisplayMetrics r0 = r12.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = 2
            if (r0 >= 0) goto L_0x02cd
            r11 = 1
        L_0x02cd:
            android.util.DisplayMetrics r0 = r12.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x037d
            r10 = 1
        L_0x02da:
            boolean r0 = X.AnonymousClass6UZ.A06
            X.AnonymousClass6UZ.A02(r0)
            X.5xY r0 = X.AnonymousClass6UZ.A0B
            java.lang.String r0 = r0.A03
            android.net.Uri$Builder r7 = X.C90504aG.A0I(r0)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            int r9 = r9 / r11
            X.C90494aF.A1L(r0, r9)
            int r8 = r8 / r11
            java.lang.String r1 = X.C36381kD.A10(r0, r8)
            java.lang.String r0 = "size"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "scale"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "marker_scale"
            android.net.Uri$Builder r1 = r7.appendQueryParameter(r0, r1)
            java.lang.String r0 = "language"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r0, r6)
            java.lang.String r1 = r2.A05
            if (r1 != 0) goto L_0x031a
            java.lang.String r1 = "jpg"
        L_0x031a:
            java.lang.String r0 = "format"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r1)
            java.lang.String r1 = r2.A0A
            java.lang.String r0 = "visible"
            if (r1 == 0) goto L_0x0329
            r6.appendQueryParameter(r0, r1)
        L_0x0329:
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "circle"
            if (r1 == 0) goto L_0x0332
            r6.appendQueryParameter(r0, r1)
        L_0x0332:
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "markers"
            if (r1 == 0) goto L_0x033b
            r6.appendQueryParameter(r0, r1)
        L_0x033b:
            java.lang.String r1 = r2.A07
            java.lang.String r0 = "path"
            if (r1 == 0) goto L_0x0344
            r6.appendQueryParameter(r0, r1)
        L_0x0344:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "center"
            if (r1 == 0) goto L_0x034d
            r6.appendQueryParameter(r0, r1)
        L_0x034d:
            java.lang.String r1 = r2.A0B
            java.lang.String r0 = "zoom"
            if (r1 == 0) goto L_0x0356
            r6.appendQueryParameter(r0, r1)
        L_0x0356:
            java.util.List r0 = r2.A0C
            int r8 = r0.size()
            r7 = 0
        L_0x035d:
            if (r7 >= r8) goto L_0x0387
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "marker_list["
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C90474aD.A0g(r1)
            java.util.List r0 = r2.A0C
            java.lang.String r0 = X.C36401kF.A0s(r0, r7)
            if (r0 == 0) goto L_0x037a
            r6.appendQueryParameter(r1, r0)
        L_0x037a:
            int r7 = r7 + 1
            goto L_0x035d
        L_0x037d:
            r0 = 1075838976(0x40200000, float:2.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r10 = 3
            if (r0 >= 0) goto L_0x02da
            r10 = 2
            goto L_0x02da
        L_0x0387:
            java.lang.String r1 = r2.A09
            java.lang.String r0 = "theme"
            if (r1 == 0) goto L_0x0390
            r6.appendQueryParameter(r0, r1)
        L_0x0390:
            java.lang.String r1 = r2.A04
            if (r1 != 0) goto L_0x0396
            java.lang.String r1 = "StaticMapView.java"
        L_0x0396:
            java.lang.String r0 = "_nc_client_caller"
            r6.appendQueryParameter(r0, r1)
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "_nc_client_id"
            if (r1 == 0) goto L_0x03a4
            r6.appendQueryParameter(r0, r1)
        L_0x03a4:
            android.net.Uri r1 = r6.build()
            X.5B8 r0 = r3.A05
            X.1e2 r3 = r0.A09
            java.lang.String r0 = "https://mbasic.facebook.com/maps/information/?"
            android.net.Uri$Builder r2 = X.C90504aG.A0I(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "static_map_url"
            android.net.Uri r1 = X.C90484aE.A0M(r2, r0, r1)
            r0 = 0
            r3.Bp7(r5, r1, r0)
            goto L_0x0096
        L_0x03c2:
            X.7mO r1 = r4.A0S
            java.lang.String r0 = "gesture_single_tap"
            r1.Bpr(r0)
            X.6jV r3 = r4.A0M
            r2 = 0
            X.6jP r1 = r3.A0E
            if (r1 == 0) goto L_0x03d9
            boolean r0 = r1 instanceof X.C97634q1
            if (r0 == 0) goto L_0x03d9
            X.4q1 r1 = (X.C97634q1) r1
            r1.A07()
        L_0x03d9:
            r3.A0E = r2
            X.6jV r0 = r4.A0M
            X.7eO r1 = r0.A0C
            if (r1 == 0) goto L_0x0019
            X.6WY r0 = r0.A0R
            X.6bv r2 = r0.A05(r6, r5)
            X.7qH r1 = (X.C163487qH) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x051d;
                case 1: goto L_0x0455;
                case 2: goto L_0x0421;
                default: goto L_0x03ee;
            }
        L_0x03ee:
            java.lang.Object r2 = r1.A00
            com.whatsapp.location.LocationPicker r2 = (com.whatsapp.location.LocationPicker) r2
            X.6Zc r0 = r2.A0P
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x040b
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0403
            X.4q1 r1 = (X.C97634q1) r1
            X.5hZ r0 = r2.A04
            r1.A09(r0)
        L_0x0403:
            X.6Zc r1 = r2.A0P
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x040b:
            X.6Zc r1 = r2.A0P
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0417
            android.view.View r1 = r1.A0B
            r0 = 0
            r1.setVisibility(r0)
        L_0x0417:
            X.6Zc r0 = r2.A0P
            android.view.View r1 = r0.A08
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0421:
            java.lang.Object r5 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r5
            X.6ov r1 = r5.A0N
            X.6N8 r0 = r1.A0N
            if (r0 == 0) goto L_0x042f
            r1.A0O()
            return
        L_0x042f:
            com.google.android.gms.maps.model.LatLng r0 = X.C134976bv.A03(r2)
            X.6N8 r4 = r1.A0J(r0)
            if (r4 == 0) goto L_0x0019
            java.util.List r3 = r4.A04
            int r0 = r3.size()
            r2 = 1
            if (r0 != r2) goto L_0x053f
            X.6ov r0 = r5.A0N
            r0.A0W(r4, r2)
            java.util.Map r1 = r5.A0S
            java.lang.String r0 = r4.A03
            java.lang.Object r0 = r1.get(r0)
            X.4q1 r0 = (X.C97634q1) r0
            r0.A08()
            return
        L_0x0455:
            java.lang.Object r0 = r1.A00
            X.5FH r0 = (X.AnonymousClass5FH) r0
            X.C36341k9.A1D(r0)
            X.5E6 r0 = r0.A03
            if (r0 == 0) goto L_0x0019
            X.00S r0 = r0.A03
            r0.invoke()
            return
        L_0x0466:
            boolean r0 = r13 instanceof X.C97794qH
            if (r0 == 0) goto L_0x04a9
            r6 = r13
            X.4qH r6 = (X.C97794qH) r6
            X.4q3 r0 = r6.A04
            int r5 = r6.A01
            int r4 = r6.A02
            int r3 = r6.A03
            X.6VI r2 = r0.A07(r5, r4, r3)
            X.6VI r0 = X.C161127mE.A00
            if (r2 == r0) goto L_0x0491
            r0 = 0
            if (r2 == 0) goto L_0x0486
        L_0x0480:
            r2.A02 = r5
            r2.A03 = r4
            r2.A04 = r3
        L_0x0486:
            X.4qG r1 = new X.4qG
            r1.<init>(r6, r2, r0)
            android.os.Handler r0 = X.C133046Wl.A01
            r0.post(r1)
            return
        L_0x0491:
            int r1 = r2.A01
            int r0 = r2.A00
            X.6VI r2 = new X.6VI
            r2.<init>(r1, r0)
            android.graphics.Bitmap r1 = X.AnonymousClass6VI.A0F
            monitor-enter(r2)
            android.graphics.Bitmap r0 = r2.A05     // Catch:{ all -> 0x0564 }
            if (r0 == r1) goto L_0x04a4
            X.AnonymousClass6VI.A01(r2)     // Catch:{ all -> 0x0564 }
        L_0x04a4:
            r2.A05 = r1     // Catch:{ all -> 0x0564 }
            monitor-exit(r2)
            r0 = 1
            goto L_0x0480
        L_0x04a9:
            boolean r0 = r13 instanceof X.C97784qG
            if (r0 == 0) goto L_0x04eb
            r3 = r13
            X.4qG r3 = (X.C97784qG) r3
            X.4qH r6 = r3.A00
            X.4q3 r5 = r6.A04
            X.6jV r0 = r5.A07
            X.4ej r0 = r0.A0Q
            int r2 = r0.A0G
            X.6VI r1 = r3.A01
            if (r1 == 0) goto L_0x056b
            X.6TZ r0 = r5.A09
            r0.A03(r1)
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0019
            int r1 = r6.A03
            int r0 = r2 + 1
            if (r1 > r0) goto L_0x0019
            r5.A03()
            java.util.ArrayList r3 = X.C97654q3.A0C
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0019
            int r2 = r3.size()
            r1 = 0
        L_0x04dd:
            if (r1 >= r2) goto L_0x0567
            java.lang.Object r0 = r3.get(r1)
            X.6jP r0 = (X.C139206jP) r0
            r0.A03()
            int r1 = r1 + 1
            goto L_0x04dd
        L_0x04eb:
            r0 = r13
            X.4qB r0 = (X.C97734qB) r0
            X.4ej r2 = r0.A00
            double r0 = X.C92794ej.A0n
            java.util.Queue r0 = r2.A0T
            if (r0 == 0) goto L_0x0019
        L_0x04f6:
            java.util.Queue r0 = r2.A0T
            java.lang.Object r1 = r0.poll()
            X.7eQ r1 = (X.AnonymousClass7eQ) r1
            if (r1 == 0) goto L_0x0586
            X.6jV r0 = r2.A0M
            r1.BaR(r0)
            goto L_0x04f6
        L_0x0506:
            int r1 = r3.size()     // Catch:{ all -> 0x051a }
        L_0x050a:
            if (r2 >= r1) goto L_0x0518
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x051a }
            X.6P6 r0 = (X.AnonymousClass6P6) r0     // Catch:{ all -> 0x051a }
            r0.A01()     // Catch:{ all -> 0x051a }
            int r2 = r2 + 1
            goto L_0x050a
        L_0x0518:
            monitor-exit(r3)     // Catch:{ all -> 0x051a }
            return
        L_0x051a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x051a }
            throw r0
        L_0x051d:
            java.lang.Object r0 = r1.A00
            X.51F r0 = (X.AnonymousClass51F) r0
            X.4kp r2 = r0.A3i()
            X.6To r1 = r2.A08
            X.011 r0 = r1.A06
            if (r0 == 0) goto L_0x0534
            java.lang.Object r0 = r0.second
            X.4q5 r0 = (X.C97674q5) r0
            if (r0 == 0) goto L_0x0534
            r0.A08()
        L_0x0534:
            r0 = 0
            r1.A06 = r0
            X.1Rs r1 = r2.A0W
            r0 = 12
            X.C36341k9.A16(r1, r0)
            return
        L_0x053f:
            X.6jV r0 = r5.A05
            float r1 = X.C134996bx.A00(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0551
            X.6ov r0 = r5.A0N
            r0.A0W(r4, r2)
            return
        L_0x0551:
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0H(r5, r3, r2)
            X.6ov r2 = r5.A0N
            X.6jV r0 = r5.A05
            float r1 = X.C134996bx.A00(r0)
            X.5qG r0 = new X.5qG
            r0.<init>(r3, r1)
            r2.A0L = r0
            return
        L_0x0564:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0567:
            r3.clear()
            return
        L_0x056b:
            int r4 = r6.A00
            if (r4 <= 0) goto L_0x0580
            int r3 = r6.A03
            r0 = -1
            if (r3 == r0) goto L_0x0576
            if (r3 != r2) goto L_0x0580
        L_0x0576:
            int r2 = r6.A01
            int r1 = r6.A02
            int r0 = r4 + -1
            r5.A09(r2, r1, r3, r0)
            return
        L_0x0580:
            X.6VI r0 = r6.A05
            r0.A04()
            return
        L_0x0586:
            r0 = 0
            r2.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75L.run():void");
    }
}
