package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1aA  reason: invalid class name and case insensitive filesystem */
public final class C30411aA implements C236319f {
    public final C20300xL A00;
    public final AnonymousClass1XT A01;
    public final C19420v0 A02;
    public final AnonymousClass189 A03;
    public final AnonymousClass18I A04;
    public final C30421aB A05;
    public final C19770wU A06;

    public int[] BCF() {
        return new int[]{74, 75, 76, 77, 78, 196, 82, 83, 84};
    }

    public boolean BJl(Message message, int i) {
        int A002;
        C19770wU r3;
        int i2;
        C19770wU r4;
        Runnable runnable;
        Jid[] jidArr;
        Object[] objArr;
        if (i != 196) {
            switch (i) {
                case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                    List list = (List) message.obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append("RecvPreKeyMessageListener/onGetPreKeySuccess Schedule processing of prekeys. Count = ");
                    sb.append(list.size());
                    Log.i(sb.toString());
                    AnonymousClass1XT r5 = this.A01;
                    synchronized (r5) {
                        A002 = C20800yB.A00(C21000yV.A01, r5.A05, 767);
                    }
                    if (A002 <= 0 || list.size() < A002) {
                        r3 = this.A06;
                        i2 = 16;
                    } else {
                        r3 = this.A06;
                        i2 = 15;
                    }
                    r3.Bp1(new C35741jB(this, list, i2));
                    return true;
                case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                    Jid A022 = Jid.Companion.A02(((BaseBundle) message.obj).getString("jid"));
                    C18740tg.A06(A022);
                    r4 = this.A06;
                    runnable = new C35741jB(this, A022, 14);
                    break;
                case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                    BaseBundle baseBundle = (BaseBundle) message.obj;
                    String[] stringArray = baseBundle.getStringArray("jids");
                    if (stringArray == null) {
                        jidArr = null;
                    } else {
                        List asList = Arrays.asList(stringArray);
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        AnonymousClass143.A0D(asList, arrayList);
                        jidArr = (Jid[]) arrayList.toArray(new Jid[0]);
                    }
                    C18740tg.A06(jidArr);
                    int length = jidArr.length;
                    DeviceJid[] deviceJidArr = new DeviceJid[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        deviceJidArr[i3] = DeviceJid.of(jidArr[i3]);
                    }
                    C30421aB r7 = this.A05;
                    int i4 = baseBundle.getInt("errorCode");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("prekey request failed; jid=");
                    sb2.append(Arrays.toString(deviceJidArr));
                    sb2.append("; errorCode=");
                    sb2.append(i4);
                    Log.i(sb2.toString());
                    AnonymousClass1XT r9 = r7.A02;
                    synchronized (r9) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("prekeysmanager/onGetPreKeyError:");
                        sb3.append(Arrays.toString(deviceJidArr));
                        Log.e(sb3.toString());
                        for (int i5 = 0; i5 < length; i5++) {
                            DeviceJid deviceJid = deviceJidArr[i5];
                            AnonymousClass9MQ r2 = (AnonymousClass9MQ) r9.A08.remove(deviceJid);
                            if (500 <= i4 && i4 < 600 && r2 != null) {
                                r9.A09.put(deviceJid, r2);
                            }
                        }
                        if (500 <= i4 && i4 < 600 && (!r9.A01 || (!r9.A00 && r9.A08.isEmpty()))) {
                            r9.A01 = true;
                            r9.A00 = true;
                            r9.A02.postDelayed(new C35641j1((Object) r9, 42), r9.A07.A01() * 1000);
                        }
                    }
                    boolean z = false;
                    if (i4 == 406) {
                        z = true;
                    }
                    r4 = r7.A07;
                    runnable = new C35291iS(r7, deviceJidArr, 12, z);
                    break;
                case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                    C20300xL r52 = this.A00;
                    synchronized (r52) {
                        for (C22819AwU awU : r52.getObservers()) {
                            C21126A9m a9m = (C21126A9m) awU;
                            ((C20300xL) a9m.A00.A00.A01(C20300xL.class)).A09(a9m);
                            a9m.A01.resumeWith(new C119485pt(C108095Sd.UNKNOWN, true));
                        }
                        C121865tq[] r42 = r52.A03;
                        r52.A03 = null;
                        if (r52.A07.A0L() && r52.A09.A2Q()) {
                            AnonymousClass1VR r72 = r52.A08;
                            Log.i("CompanionRegistrationLogger/logRegistrationComplete");
                            r72.A05.Boy(new C35211iK(r72, 5, 1, 0));
                        }
                        if (r52.A0A.A0X()) {
                            r52.A0F.Boy(new C35621iz(r52, r42, 7));
                        } else {
                            AnonymousClass187 r32 = r52.A0B;
                            r32.A00.execute(new C35621iz(r52, r42, 8));
                        }
                        C20300xL.A00(r52);
                    }
                    return true;
                case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                    int i6 = ((BaseBundle) message.obj).getInt("errorCode");
                    C20300xL r92 = this.A00;
                    synchronized (r92) {
                        for (C22819AwU awU2 : r92.getObservers()) {
                            C21126A9m a9m2 = (C21126A9m) awU2;
                            ((C20300xL) a9m2.A00.A00.A01(C20300xL.class)).A09(a9m2);
                            a9m2.A01.resumeWith(new C119485pt(C108095Sd.RESET_IDENTITY_FAILED, false));
                        }
                        r92.A03 = null;
                        C20300xL.A01(r92, 0);
                        if (r92.A07.A0L() && r92.A09.A2Q()) {
                            r92.A08.A00(4, (long) i6);
                        }
                        if (i6 == 406) {
                            Log.e("failed to set prekeys; regenerating keys; errorCode=406");
                            if (r92.A0A.A0X()) {
                                r92.A0F.Boy(new C35641j1((Object) r92, 39));
                            } else {
                                AnonymousClass187 r33 = r92.A0B;
                                r33.A00.execute(new C35641j1((Object) r92, 39));
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("failed to set prekeys; will try again on next xmpp connect; errorCode=");
                            sb4.append(i6);
                            Log.e(sb4.toString());
                            if (i6 >= 500 && i6 < 600) {
                                r92.A02 = true;
                                r92.A06.A0I(new C35641j1((Object) r92, 38), r92.A0E.A01() * 1000);
                            }
                        }
                    }
                    return true;
                default:
                    switch (i) {
                        case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                            Bundle bundle = (Bundle) message.obj;
                            byte[] byteArray = bundle.getByteArray("registration");
                            byte b = bundle.getByte(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            byte[] byteArray2 = bundle.getByteArray("signedKeyId");
                            Object[] objArr2 = (Object[]) bundle.getSerializable("keyIds");
                            if (objArr2 == null) {
                                objArr = null;
                            } else {
                                int length2 = objArr2.length;
                                objArr = new byte[length2][];
                                for (int i7 = 0; i7 < length2; i7++) {
                                    objArr[i7] = objArr2[i7];
                                }
                            }
                            byte[] byteArray3 = bundle.getByteArray("hash");
                            Log.i("checking prekey digest");
                            this.A00.A05();
                            this.A06.Boy(new C35431ig(this, byteArray, byteArray2, objArr, byteArray3, b, 1));
                            return true;
                        case 83:
                            Log.i("prekey digest none");
                            this.A00.A05();
                            r4 = this.A06;
                            runnable = new C35711j8(this, 37);
                            break;
                        case 84:
                            Log.i("prekey digest server error");
                            this.A00.A05();
                            return true;
                        default:
                            return false;
                    }
            }
            r4.Boy(runnable);
            return true;
        }
        BaseBundle baseBundle2 = (BaseBundle) message.obj;
        baseBundle2.getInt("errorCode");
        baseBundle2.getString("errorText");
        synchronized (this.A00) {
        }
        return true;
    }

    public C30411aA(C20300xL r1, AnonymousClass1XT r2, C19420v0 r3, AnonymousClass189 r4, AnonymousClass18I r5, C30421aB r6, C19770wU r7) {
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = r2;
    }
}
