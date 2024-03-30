package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.4c9  reason: invalid class name and case insensitive filesystem */
public abstract class C91524c9 extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C91524c9(String str) {
        attachInterface(this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05d1, code lost:
        if (r3.A0L.A05() != false) goto L_0x05d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            r10 = this;
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 <= r0) goto L_0x000d
            boolean r0 = super.onTransact(r11, r12, r13, r14)
            if (r0 == 0) goto L_0x0014
        L_0x000b:
            r0 = 1
            return r0
        L_0x000d:
            java.lang.String r0 = r10.getInterfaceDescriptor()
            r12.enforceInterface(r0)
        L_0x0014:
            r3 = r10
            boolean r0 = r10 instanceof X.C99114se
            if (r0 == 0) goto L_0x00c7
            X.4se r3 = (X.C99114se) r3
            r4 = 1
            if (r11 != r4) goto L_0x05ef
            android.os.Parcelable$Creator r0 = com.google.android.gms.maps.model.LatLng.CREATOR
            android.os.Parcelable r2 = X.AnonymousClass000.A0W(r12, r0)
            com.google.android.gms.maps.model.LatLng r2 = (com.google.android.gms.maps.model.LatLng) r2
            X.7f5 r1 = r3.A00
            X.7qJ r1 = (X.C163507qJ) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0065;
                case 1: goto L_0x006f;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.Object r2 = r1.A00
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.6Zc r0 = r2.A0W
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0044
            X.6Fg r1 = (X.C129116Fg) r1
            X.5iI r0 = r2.A03
            r1.A04(r0)
        L_0x0044:
            X.6Zc r1 = r2.A0W
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x004c:
            X.6Zc r1 = r2.A0W
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0058
            android.view.View r1 = r1.A0B
            r0 = 0
            r1.setVisibility(r0)
        L_0x0058:
            X.6Zc r0 = r2.A0W
            android.view.View r1 = r0.A08
            r0 = 8
        L_0x005e:
            r1.setVisibility(r0)
        L_0x0061:
            r13.writeNoException()
            goto L_0x000b
        L_0x0065:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            X.6Za r0 = r0.A0A
            android.view.View r1 = r0.A03
            r0 = 0
            goto L_0x005e
        L_0x006f:
            java.lang.Object r5 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r5
            X.6ov r1 = r5.A0O
            X.6N8 r0 = r1.A0N
            if (r0 == 0) goto L_0x007d
            r1.A0O()
            goto L_0x0061
        L_0x007d:
            X.6N8 r2 = r1.A0J(r2)
            if (r2 == 0) goto L_0x0061
            java.util.List r3 = r2.A04
            int r0 = r3.size()
            if (r0 != r4) goto L_0x009e
            X.6ov r0 = r5.A0O
            r0.A0W(r2, r4)
            java.util.Map r1 = r5.A0T
            java.lang.String r0 = r2.A03
            java.lang.Object r0 = r1.get(r0)
            X.6Fg r0 = (X.C129116Fg) r0
            r0.A03()
            goto L_0x0061
        L_0x009e:
            X.6Fs r0 = r5.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b2
            X.6ov r0 = r5.A0O
            r0.A0W(r2, r4)
            goto L_0x0061
        L_0x00b2:
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0H(r5, r3, r4)
            X.6ov r2 = r5.A0O
            X.6Fs r0 = r5.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            X.5qG r0 = new X.5qG
            r0.<init>(r3, r1)
            r2.A0L = r0
            goto L_0x0061
        L_0x00c7:
            boolean r0 = r10 instanceof X.C99104sd
            if (r0 == 0) goto L_0x01f6
            X.4sd r3 = (X.C99104sd) r3
            r4 = 1
            if (r11 != r4) goto L_0x05ef
            X.7f2 r1 = r3.A00
            X.7sE r1 = (X.C164697sE) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x011e;
                case 1: goto L_0x01b1;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            java.lang.Object r2 = r1.A00
            com.whatsapp.location.LocationPicker2 r2 = (com.whatsapp.location.LocationPicker2) r2
            X.6Zc r0 = r2.A0W
            android.view.View r0 = r0.A09
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0104
            X.6Zc r0 = r2.A0W
            android.view.View r1 = r0.A09
            r0 = 8
            r1.setVisibility(r0)
            X.6Zc r0 = r2.A0W
            android.view.View r0 = r0.A09
            int r0 = r0.getHeight()
            int r0 = -r0
            android.view.animation.TranslateAnimation r1 = X.C90464aC.A0E(r0)
            X.6Zc r0 = r2.A0W
            android.view.View r0 = r0.A0A
            r0.startAnimation(r1)
        L_0x0104:
            X.6Fs r0 = r2.A02
            X.C18740tg.A06(r0)
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            if (r0 == 0) goto L_0x0061
            X.6Zc r4 = r2.A0W
            double r2 = r0.A00
            double r0 = r0.A01
            r4.A0O(r2, r0)
            goto L_0x0061
        L_0x011e:
            java.lang.Object r3 = r1.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0149
            X.6Za r0 = r3.A0A
            android.view.View r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A01
            int r0 = r0.getHeight()
            int r0 = -r0
            android.view.animation.TranslateAnimation r1 = X.C90464aC.A0E(r0)
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A02
            r0.startAnimation(r1)
        L_0x0149:
            X.6Fs r1 = r3.A01
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap map is not available"
            X.C18740tg.A07(r1, r0)
            X.6Za r2 = r3.A0A
            com.google.android.gms.maps.model.CameraPosition r0 = r1.A02()
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            double r0 = r0.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A09 = r0
            X.6Za r2 = r3.A0A
            X.6Fs r0 = r3.A01
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            com.google.android.gms.maps.model.LatLng r0 = r0.A03
            double r0 = r0.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A0A = r0
            X.6Za r1 = r3.A0A
            X.6Fs r0 = r3.A01
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.A0B = r0
            X.6Za r0 = r3.A0A
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x018d
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0H(r3)
            goto L_0x0061
        L_0x018d:
            X.6Eo r0 = r3.A08
            X.6QG r2 = r0.A01()
            if (r2 != 0) goto L_0x019f
            X.6Sz r0 = r3.A09
            X.6QG r2 = r0.A00
            if (r2 != 0) goto L_0x019f
            X.6QG r2 = X.C132296Sz.A00(r0)
        L_0x019f:
            X.6Za r1 = r3.A0A
            java.lang.String r0 = r2.A07
            X.C18740tg.A06(r0)
            r1.A03(r0)
            X.6Za r0 = r3.A0A
            r0.A08 = r2
            r0.A0G = r4
            goto L_0x0061
        L_0x01b1:
            java.lang.Object r3 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r3
            X.6Fs r0 = r3.A06
            X.C18740tg.A06(r0)
            com.google.android.gms.maps.model.CameraPosition r4 = r0.A02()
            if (r4 == 0) goto L_0x0061
            float r1 = r3.A00
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 * r0
            int r2 = (int) r1
            float r1 = r4.A02
            float r0 = r0 * r1
            int r0 = (int) r0
            if (r2 == r0) goto L_0x01d1
            r3.A00 = r1
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0G(r3)
        L_0x01d1:
            X.6ov r1 = r3.A0O
            X.5qG r0 = r1.A0L
            if (r0 == 0) goto L_0x01db
            r0 = 0
            r1.A0Y(r0)
        L_0x01db:
            X.6ov r0 = r3.A0O
            X.6N8 r1 = r0.A0N
            if (r1 == 0) goto L_0x0061
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.maps.model.LatLng r0 = r1.A00()
            boolean r0 = com.whatsapp.location.GroupChatLiveLocationsActivity2.A0J(r0, r3)
            if (r0 == 0) goto L_0x0061
            X.6ov r0 = r3.A0O
            r0.A0O()
            goto L_0x0061
        L_0x01f6:
            boolean r0 = r10 instanceof X.C99094sc
            if (r0 == 0) goto L_0x020a
            X.4sc r3 = (X.C99094sc) r3
            r0 = 1
            if (r11 != r0) goto L_0x05ef
            X.7cO r0 = r3.A00
            X.6nH r0 = (X.C141456nH) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = r0.A00
        L_0x0205:
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0G(r0)
            goto L_0x0061
        L_0x020a:
            boolean r0 = r10 instanceof X.C99084sb
            if (r0 == 0) goto L_0x02ad
            X.4sb r3 = (X.C99084sb) r3
            r4 = 1
            if (r11 != r4) goto L_0x05ef
            int r5 = r12.readInt()
            X.7f3 r1 = r3.A00
            X.6hP r1 = (X.C138166hP) r1
            int r0 = r1.A01
            java.lang.Object r3 = r1.A00
            switch(r0) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02be;
                default: goto L_0x0222;
            }
        L_0x0222:
            com.whatsapp.location.LocationPicker2 r3 = (com.whatsapp.location.LocationPicker2) r3
            r2 = 8
            if (r5 != r4) goto L_0x023b
            X.6Zc r1 = r3.A0W
            boolean r0 = r1.A0i
            r4 = 0
            if (r0 == 0) goto L_0x0266
            android.widget.ImageView r1 = r1.A0K
            r0 = 2131231185(0x7f0801d1, float:1.8078444E38)
            r1.setImageResource(r0)
            X.6Zc r0 = r3.A0W
            r0.A0h = r4
        L_0x023b:
            X.6Zc r1 = r3.A0W
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x0246
            android.view.View r0 = r1.A08
            r0.setVisibility(r2)
        L_0x0246:
            r0 = 2131431380(0x7f0b0fd4, float:1.8484488E38)
            android.view.View r4 = r3.findViewById(r0)
            r0 = 2131431302(0x7f0b0f86, float:1.848433E38)
            android.view.View r1 = r3.findViewById(r0)
            if (r4 == 0) goto L_0x0259
            r4.setVisibility(r2)
        L_0x0259:
            if (r1 == 0) goto L_0x0061
            X.6Zc r0 = r3.A0W
            boolean r0 = r0.A0e
            if (r0 == 0) goto L_0x0061
            r1.setVisibility(r2)
            goto L_0x0061
        L_0x0266:
            com.whatsapp.location.PlaceInfo r0 = r1.A0V
            if (r0 == 0) goto L_0x0280
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0278
            X.6Fg r1 = (X.C129116Fg) r1
            X.5iI r0 = r3.A03
            r1.A04(r0)
            r1.A02()
        L_0x0278:
            X.6Zc r1 = r3.A0W
            r0 = 0
            r1.A0V = r0
            X.C133586Zc.A0C(r1)
        L_0x0280:
            X.6Zc r1 = r3.A0W
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x023b
            android.view.View r0 = r1.A09
            r0.setVisibility(r4)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A09
            int r0 = r0.getHeight()
            android.view.animation.TranslateAnimation r1 = X.C90464aC.A0E(r0)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A0A
            r0.startAnimation(r1)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A0B
            r0.setVisibility(r4)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A08
            r0.setVisibility(r2)
            goto L_0x023b
        L_0x02ad:
            boolean r0 = r10 instanceof X.C99074sa
            if (r0 == 0) goto L_0x030c
            X.4sa r3 = (X.C99074sa) r3
            r0 = 1
            if (r11 != r0) goto L_0x05ef
            X.7cP r0 = r3.A00
            X.6nI r0 = (X.C141466nI) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = r0.A00
            goto L_0x0205
        L_0x02be:
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r3
            if (r5 != r4) goto L_0x0061
            X.6Fs r0 = r3.A06
            X.C18740tg.A06(r0)
            X.6ov r0 = r3.A0O
            r0.A0W = r4
            r2 = 0
            r0.A0U = r2
            android.view.View r1 = r0.A0C
            X.3Kq r0 = r0.A0O
            if (r0 == 0) goto L_0x02d6
            r2 = 8
        L_0x02d6:
            r1.setVisibility(r2)
            X.6Fs r0 = r3.A06
            r0.A04()
            X.6ov r0 = r3.A0O
            r0.A0V = r4
            goto L_0x0061
        L_0x02e4:
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r3 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r3
            if (r5 != r4) goto L_0x0061
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A01
            r2 = 0
            r0.setVisibility(r2)
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A01
            int r0 = r0.getHeight()
            android.view.animation.TranslateAnimation r1 = X.C90464aC.A0E(r0)
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A02
            r0.startAnimation(r1)
            X.6Za r0 = r3.A0A
            android.view.View r0 = r0.A03
            r0.setVisibility(r2)
            goto L_0x0061
        L_0x030c:
            boolean r0 = r10 instanceof X.C99064sZ
            if (r0 == 0) goto L_0x034b
            X.4sZ r3 = (X.C99064sZ) r3
            r0 = 1
            if (r11 == r0) goto L_0x0337
            r0 = 2
            if (r11 != r0) goto L_0x05ef
            android.os.IBinder r0 = r12.readStrongBinder()
            X.7me r1 = X.C99124sf.A00(r0)
            X.6Fg r0 = new X.6Fg
            r0.<init>(r1)
            r1 = 0
        L_0x0326:
            X.0LR r0 = new X.0LR
            r0.<init>(r1)
            r13.writeNoException()
            android.os.IBinder r0 = r0.asBinder()
            r13.writeStrongBinder(r0)
            goto L_0x000b
        L_0x0337:
            android.os.IBinder r0 = r12.readStrongBinder()
            X.7me r2 = X.C99124sf.A00(r0)
            X.7f1 r1 = r3.A00
            X.6Fg r0 = new X.6Fg
            r0.<init>(r2)
            android.view.View r1 = r1.BCg(r0)
            goto L_0x0326
        L_0x034b:
            boolean r0 = r10 instanceof X.C99054sY
            if (r0 == 0) goto L_0x03f8
            X.4sY r3 = (X.C99054sY) r3
            r6 = 1
            if (r11 != r6) goto L_0x05ef
            android.os.IBinder r0 = r12.readStrongBinder()
            X.7me r0 = X.C99124sf.A00(r0)
            X.7f4 r1 = r3.A00
            X.6Fg r2 = new X.6Fg
            r2.<init>(r0)
            X.7qR r1 = (X.C163587qR) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0388
            java.lang.Object r0 = r1.A00
            com.whatsapp.location.LocationPicker2 r0 = (com.whatsapp.location.LocationPicker2) r0
            X.6Zc r4 = r0.A0W
            X.7me r3 = r2.A00     // Catch:{ RemoteException -> 0x05e3 }
            X.6a2 r3 = (X.C133816a2) r3     // Catch:{ RemoteException -> 0x05e3 }
            android.os.Parcel r1 = X.C133816a2.A00(r3)     // Catch:{ RemoteException -> 0x05e3 }
            r0 = 2
            android.os.Parcel r1 = r3.A02(r0, r1)     // Catch:{ RemoteException -> 0x05e3 }
            java.lang.String r0 = r1.readString()     // Catch:{ RemoteException -> 0x05e3 }
            r1.recycle()     // Catch:{ RemoteException -> 0x05e3 }
            r4.A0X(r0, r2)
            goto L_0x0061
        L_0x0388:
            java.lang.Object r7 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r7 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r7
            java.lang.Object r0 = r2.A01()
            X.6N8 r0 = (X.AnonymousClass6N8) r0
            if (r0 == 0) goto L_0x0061
            X.0wQ r1 = r7.A02
            X.3Kq r0 = r0.A02
            com.whatsapp.jid.UserJid r9 = r0.A06
            boolean r0 = r1.A0M(r9)
            if (r0 != 0) goto L_0x0061
            int[] r1 = X.C36441kJ.A1O()
            X.5B9 r0 = r7.A0N
            r0.getLocationOnScreen(r1)
            com.google.android.gms.maps.model.LatLng r1 = r2.A00()
            X.6Fs r0 = r7.A06
            X.C18740tg.A06(r0)
            X.68Y r0 = r0.A00()
            android.graphics.Point r0 = r0.A00(r1)
            android.graphics.Rect r8 = X.AnonymousClass001.A06()
            int r1 = r0.x
            r8.left = r1
            int r0 = r0.y
            r8.top = r0
            r8.right = r1
            r8.bottom = r0
            X.6ov r5 = r7.A0O
            X.3Kq r2 = r5.A0O
            r4 = 0
            if (r2 == 0) goto L_0x03f5
            double r0 = r2.A00
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            double r0 = r2.A01
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L_0x03dd:
            X.3Pd r1 = new X.3Pd
            r1.<init>((android.graphics.Rect) r8, (X.AnonymousClass11F) r9, (java.lang.Integer) r4)
            X.11F r0 = r5.A0I
            r1.A01 = r0
            r1.A05 = r6
            r1.A02 = r3
            r1.A03 = r2
            android.content.Intent r0 = r1.A01(r7)
            r7.startActivity(r0)
            goto L_0x0061
        L_0x03f5:
            r3 = r4
            r2 = r4
            goto L_0x03dd
        L_0x03f8:
            boolean r0 = r10 instanceof X.C99044sX
            if (r0 == 0) goto L_0x0427
            X.4sX r3 = (X.C99044sX) r3
            r0 = 1
            if (r11 != r0) goto L_0x05ef
            android.os.IBinder r2 = r12.readStrongBinder()
            if (r2 != 0) goto L_0x0414
            r1 = 0
        L_0x0408:
            X.7f7 r2 = r3.A00
            X.6Fs r0 = new X.6Fs
            r0.<init>(r1)
            r2.BaS(r0)
            goto L_0x0061
        L_0x0414:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)
            boolean r0 = r1 instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate
            if (r0 == 0) goto L_0x0421
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = (com.google.android.gms.maps.internal.IGoogleMapDelegate) r1
            goto L_0x0408
        L_0x0421:
            X.4sQ r1 = new X.4sQ
            r1.<init>(r2)
            goto L_0x0408
        L_0x0427:
            boolean r0 = r10 instanceof X.C99034sW
            if (r0 == 0) goto L_0x04d2
            X.4sW r3 = (X.C99034sW) r3
            r2 = 1
            if (r11 == r2) goto L_0x0450
            r0 = 2
            if (r11 != r0) goto L_0x05ef
            X.7iq r1 = r3.A00
            X.7pp r1 = (X.C163207pp) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x043e;
                case 1: goto L_0x0442;
                default: goto L_0x043c;
            }
        L_0x043c:
            goto L_0x0061
        L_0x043e:
            java.lang.Object r1 = r1.A00
            goto L_0x04cb
        L_0x0442:
            java.lang.Object r1 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            r0 = 0
            r1.A0X = r0
            X.6Fs r0 = r1.A06
            X.C18740tg.A06(r0)
            goto L_0x0061
        L_0x0450:
            X.7iq r4 = r3.A00
            X.7pp r4 = (X.C163207pp) r4
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x04c9;
                case 1: goto L_0x045b;
                default: goto L_0x0459;
            }
        L_0x0459:
            goto L_0x0061
        L_0x045b:
            java.lang.Object r1 = r4.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r1 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r1
            r0 = 0
            r1.A0X = r0
            X.6Fs r0 = r1.A06
            X.C18740tg.A06(r0)
            r0.A04()
            X.6ov r3 = r1.A0O
            X.5qG r0 = r3.A0L
            if (r0 == 0) goto L_0x0481
            X.6Fs r0 = r1.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.A0Y(r0)
            goto L_0x0061
        L_0x0481:
            X.6N8 r0 = r3.A0N
            if (r0 == 0) goto L_0x04b9
            com.google.android.gms.maps.model.LatLng r3 = r0.A00()
            X.6Fs r0 = r1.A06
            X.68Y r0 = r0.A00()
            X.4s7 r0 = r0.A02()
            com.google.android.gms.maps.model.LatLngBounds r0 = r0.A04
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x0061
            X.6ov r0 = r1.A0O
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x0061
            r1.A0X = r2
            X.6Fs r2 = r1.A06
            float r1 = r1.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = java.lang.Math.min(r1, r0)
            X.5iH r0 = X.AnonymousClass6UP.A02(r3, r0)
            r2.A0B(r0, r4)
            goto L_0x0061
        L_0x04b9:
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x0061
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x0061
            r0 = 0
            r1.A0Y = r0
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0I(r1, r2)
            goto L_0x0061
        L_0x04c9:
            java.lang.Object r1 = r4.A00
        L_0x04cb:
            X.5B9 r1 = (X.AnonymousClass5B9) r1
            r0 = 0
            r1.A0A = r0
            goto L_0x0061
        L_0x04d2:
            X.4sV r3 = (X.C99024sV) r3
            r4 = 1
            if (r11 != r4) goto L_0x05ef
            android.os.IBinder r0 = r12.readStrongBinder()
            X.7me r0 = X.C99124sf.A00(r0)
            X.7f6 r1 = r3.A00
            X.6Fg r2 = new X.6Fg
            r2.<init>(r0)
            X.7qS r1 = (X.C163597qS) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x050c
            java.lang.Object r3 = r1.A00
            com.whatsapp.location.LocationPicker2 r3 = (com.whatsapp.location.LocationPicker2) r3
            X.6Zc r0 = r3.A0W
            boolean r0 = r0.A0i
            if (r0 != 0) goto L_0x05d6
            X.7me r4 = r2.A00     // Catch:{ RemoteException -> 0x05e9 }
            X.6a2 r4 = (X.C133816a2) r4     // Catch:{ RemoteException -> 0x05e9 }
            android.os.Parcel r1 = X.C133816a2.A00(r4)     // Catch:{ RemoteException -> 0x05e9 }
            r0 = 2
            android.os.Parcel r1 = r4.A02(r0, r1)     // Catch:{ RemoteException -> 0x05e9 }
            java.lang.String r0 = r1.readString()     // Catch:{ RemoteException -> 0x05e9 }
            r1.recycle()     // Catch:{ RemoteException -> 0x05e9 }
            goto L_0x05d8
        L_0x050c:
            java.lang.Object r6 = r1.A00
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r6 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r6
            X.6Fs r0 = r6.A06
            X.C18740tg.A06(r0)
            X.6ov r0 = r6.A0O
            r0.A0W = r4
            r7 = 0
            r0.A0U = r7
            android.view.View r3 = r0.A0C
            X.3Kq r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x0525
            r0 = 0
        L_0x0525:
            r3.setVisibility(r0)
            java.lang.Object r0 = r2.A01()
            boolean r0 = r0 instanceof X.AnonymousClass6N8
            if (r0 == 0) goto L_0x0591
            java.lang.Object r5 = r2.A01()
            X.6N8 r5 = (X.AnonymousClass6N8) r5
            boolean r0 = r2.A09()
            if (r0 != 0) goto L_0x0556
            X.6ov r1 = r6.A0O
            java.util.List r0 = r5.A04
            java.lang.Object r0 = r0.get(r7)
            X.3Kq r0 = (X.C63593Kq) r0
            X.6N8 r5 = r1.A0K(r0)
            if (r5 == 0) goto L_0x0591
            java.lang.String r1 = r5.A03
            java.util.Map r0 = r6.A0T
            java.lang.Object r2 = r0.get(r1)
            X.6Fg r2 = (X.C129116Fg) r2
        L_0x0556:
            int r0 = r5.A00
            if (r0 == r4) goto L_0x0591
            java.util.List r3 = r5.A04
            int r0 = r3.size()
            if (r0 != r4) goto L_0x0568
            X.6ov r0 = r6.A0O
            r0.A0W(r5, r4)
            goto L_0x05d3
        L_0x0568:
            X.6Fs r0 = r6.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x057c
            X.6ov r0 = r6.A0O
            r0.A0W(r5, r4)
            goto L_0x05d6
        L_0x057c:
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0H(r6, r3, r4)
            X.6ov r2 = r6.A0O
            X.6Fs r0 = r6.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r1 = r0.A02
            X.5qG r0 = new X.5qG
            r0.<init>(r3, r1)
            r2.A0L = r0
            goto L_0x05d6
        L_0x0591:
            X.6ov r0 = r6.A0O
            r0.A0O()
            goto L_0x05d6
        L_0x0597:
            X.6Zc r0 = r3.A0W
            com.whatsapp.location.PlaceInfo r0 = r0.A0V
            if (r0 == 0) goto L_0x05ab
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x05ab
            X.6Fg r1 = (X.C129116Fg) r1
            X.5iI r0 = r3.A03
            r1.A04(r0)
            r1.A02()
        L_0x05ab:
            X.5iI r0 = r3.A04
            r2.A04(r0)
            X.6Zc r0 = r3.A0W
            r0.A0W(r2)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A08
            r1 = 8
            r0.setVisibility(r1)
            X.6Zc r0 = r3.A0W
            android.view.View r0 = r0.A0B
            r0.setVisibility(r1)
            X.6Zc r0 = r3.A0W
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x05d3
            X.0yE r0 = r3.A0L
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x05d6
        L_0x05d3:
            r2.A03()
        L_0x05d6:
            r0 = 1
            goto L_0x05db
        L_0x05d8:
            if (r0 != 0) goto L_0x0597
            r0 = 0
        L_0x05db:
            r13.writeNoException()
            r13.writeInt(r0)
            goto L_0x000b
        L_0x05e3:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x05e9:
            r0 = move-exception
            X.78K r0 = X.AnonymousClass78K.A00(r0)
            throw r0
        L_0x05ef:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91524c9.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
