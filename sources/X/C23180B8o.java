package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.B8o  reason: case insensitive filesystem */
public class C23180B8o implements Parcelable.Creator {
    public final int A00;

    public C23180B8o(int i) {
        this.A00 = i;
    }

    public static C23180B8o A00(int i) {
        return new C23180B8o(i);
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        C202319lY r13;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                return new C207239um(parcel2);
            case 1:
                return new C206529tY(parcel2);
            case 2:
                return AppLinkDeviceConnectionStatus.values()[parcel2.readInt()];
            case 3:
                return AppLinkDeviceHardwareState.values()[parcel2.readInt()];
            case 4:
                return AppLinkDevicePeakPowerState.values()[parcel2.readInt()];
            case 5:
                return new C206809u0(parcel2);
            case 6:
                return new AXf(parcel2);
            case 7:
                return new C206429tO(parcel2);
            case 8:
                return new C206449tQ(parcel2);
            case 9:
                return new C206409tM(parcel2);
            case 10:
                return new C206989uN(parcel2);
            case 11:
                return new C206749tu(parcel2);
            case 12:
                return new C166247vP(parcel2);
            case 13:
                return new C166257vQ(parcel2);
            case 14:
                AnonymousClass00C.A0D(parcel2, 0);
                return new AnonymousClass8VY(new C207269up(parcel2), AnonymousClass000.A1O(parcel2.readByte()));
            case 15:
                AnonymousClass00C.A0D(parcel2, 0);
                return new C207269up(parcel2);
            case 16:
                String A0g = C36341k9.A0g(parcel2);
                if (A0g != null) {
                    return new C206759tv(A0g, parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt());
                }
                return null;
            case 17:
                return new C206949uI(parcel2);
            case 18:
                return new C166297vU(parcel2);
            case 19:
                return new C166267vR(parcel2);
            case 20:
                String A0g2 = C36341k9.A0g(parcel2);
                if (A0g2 != null) {
                    return new C206469tS(A0g2);
                }
                throw AnonymousClass001.A08("Required value was null.");
            case 21:
                AnonymousClass00C.A0D(parcel2, 0);
                return new C207109uZ(parcel2);
            case 22:
                return new C166287vT(parcel2);
            case 23:
                AnonymousClass00C.A0D(parcel2, 0);
                return new C175758b0(parcel2);
            case 24:
                C175878bD r10 = new C175878bD();
                r10.A09 = parcel2.readString();
                r10.A03 = parcel2.readString();
                r10.A07 = parcel2.readString();
                r10.A04 = parcel2.readString();
                r10.A05 = parcel2.readString();
                r10.A00 = (C135086c7) C36411kG.A0H(parcel2, C135086c7.class);
                r10.A02 = parcel2.readString();
                r10.A01 = (C175818b6) C36411kG.A0H(parcel2, C175818b6.class);
                return r10;
            case 25:
                return new C175748az(parcel2);
            case 26:
                return new C175798b4(parcel2);
            case 27:
                return new C175728ax(parcel2);
            case 28:
                return new C206829u4(parcel2);
            case 29:
                return new C206859u7(parcel2);
            case 30:
                return new C207159ue(parcel2);
            case 31:
                return new C206869u8(parcel2);
            case 32:
                return new C207139uc(parcel2);
            case 33:
                return new C175768b1(parcel2);
            case 34:
                return new C175788b3(parcel2);
            case 35:
                return new C207119ua(parcel2);
            case 36:
                return new C207259uo(parcel2);
            case 37:
                int readInt = parcel2.readInt();
                int readInt2 = parcel2.readInt();
                long readLong = parcel2.readLong();
                String readString = parcel2.readString();
                int readInt3 = parcel2.readInt();
                String readString2 = parcel2.readString();
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                C222813r r2 = UserJid.Companion;
                UserJid A02 = r2.A02(readString4);
                UserJid A022 = r2.A02(parcel2.readString());
                String readString5 = parcel2.readString();
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                String readString8 = parcel2.readString();
                ArrayList readArrayList = parcel2.readArrayList(C206329t8.class.getClassLoader());
                UserJid A023 = r2.A02(parcel2.readString());
                boolean A1P = AnonymousClass000.A1P(parcel2.readInt());
                long readLong2 = parcel2.readLong();
                String readString9 = parcel2.readString();
                String readString10 = parcel2.readString();
                int readInt4 = parcel2.readInt();
                boolean A1S = AnonymousClass000.A1S(parcel2.readInt(), 1);
                C135106c9 r22 = (C135106c9) C36411kG.A0H(parcel2, C135106c9.class);
                int readInt5 = parcel2.readInt();
                int readInt6 = parcel2.readInt();
                byte[] bArr = new byte[readInt6];
                if (readInt6 > 0) {
                    parcel2.readByteArray(bArr);
                }
                int readInt7 = parcel2.readInt();
                C175708av r1 = (C175708av) C36411kG.A0H(parcel2, C175708av.class);
                AnonymousClass16U A002 = AnonymousClass16T.A00(parcel2);
                if (readInt == 5) {
                    C203419nz r0 = C203419nz.$redex_init_class;
                    r13 = new C202319lY(readString10, 5, readInt4, 0, readLong2);
                    r13.A0R = bArr;
                    r13.A0L = readString5;
                    r13.A0C = A023;
                    r13.A0Q = A1P;
                    r13.A0P = A1S;
                    r13.A07 = A002;
                } else {
                    AnonymousClass16X A003 = AnonymousClass16X.A00(readString2, readInt3);
                    if (readInt != 4) {
                        r13 = new C202319lY(A002, A003, A02, A022, readString, readString3, readString6, readString7, readString8, (String) null, readString10, readInt, readInt2, readInt4, readInt7, readInt5, readLong2, readLong);
                        r13.A0L = readString5;
                        if (readArrayList != null) {
                            ArrayList A0v = C36401kF.A0v(readArrayList);
                            Iterator it = readArrayList.iterator();
                            while (it.hasNext()) {
                                A0v.add(((C206329t8) it.next()).A00);
                            }
                            r13.A0N = A0v;
                        }
                        r13.A0C = A023;
                        r13.A0Q = A1P;
                        r13.A0A = r1;
                        r13.A07 = A002;
                    } else {
                        r13 = C203419nz.A00(readLong2);
                    }
                    r13.A0M = readString9;
                    r13.A0P = A1S;
                    r13.A0C(r22);
                }
                return new C206289t2(r13);
            case 38:
                int readInt8 = parcel2.readInt();
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                C207249un A05 = C207249un.A05(C202159l8.A00(readString12), readString11, parcel2.readString(), parcel2.readString(), readInt8);
                if (A05 instanceof C175798b4) {
                    ((C175798b4) A05).A01 = parcel2.readInt();
                }
                AnonymousClass16X A004 = AnonymousClass16X.A00(parcel2.readString(), parcel2.readInt());
                int readInt9 = parcel2.readInt();
                if (A004 != null) {
                    return new C206329t8(new AnonymousClass9K8(A004, A05, readInt9));
                }
                return null;
            case 39:
                return new C175778b2(parcel2);
            case 40:
                return new C206889uA(parcel2);
            case 41:
                return new C166277vS(parcel2);
            case 42:
                return new C175698au(parcel2);
            case 43:
                C175818b6 r102 = new C175818b6();
                r102.A09 = parcel2.readString();
                Class<C135086c7> cls = C135086c7.class;
                r102.A02 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A04 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A06 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A03 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A07 = (C135086c7) C36411kG.A0H(parcel2, cls);
                boolean z2 = false;
                r102.A0I = AnonymousClass000.A1S(parcel2.readInt(), 1);
                r102.A05 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A03 = parcel2.readString();
                r102.A04 = parcel2.readString();
                r102.A08 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A0E = parcel2.readString();
                r102.A0B = parcel2.readString();
                r102.A01 = parcel2.readInt();
                r102.A0C = parcel2.readString();
                r102.A0D = parcel2.readString();
                ArrayList A0I = AnonymousClass001.A0I();
                r102.A0F = A0I;
                parcel2.readStringList(A0I);
                int readInt10 = parcel2.readInt();
                if (readInt10 != 0) {
                    byte[] bArr2 = new byte[readInt10];
                    r102.A09 = bArr2;
                    parcel2.readByteArray(bArr2);
                }
                r102.A06 = parcel2.readString();
                r102.A01 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A02 = (C135086c7) C36411kG.A0H(parcel2, cls);
                r102.A00 = parcel2.readLong();
                r102.A07 = AnonymousClass000.A1S(parcel2.readInt(), 1);
                r102.A08 = AnonymousClass000.A1S(parcel2.readInt(), 1);
                r102.A0A = parcel2.readString();
                r102.A0J = AnonymousClass000.A1S(parcel2.readInt(), 1);
                r102.A0H = AnonymousClass000.A1S(parcel2.readInt(), 1);
                if (parcel2.readInt() == 1) {
                    z2 = true;
                }
                r102.A0G = z2;
                return r102;
            case 44:
                return new C207189uh(parcel2);
            case 45:
                C175928bI r103 = new C175928bI();
                r103.A0N(parcel2);
                Class<C135086c7> cls2 = C135086c7.class;
                r103.A0D = (C135086c7) C36411kG.A0H(parcel2, cls2);
                r103.A0U = parcel2.readString();
                r103.A0S = parcel2.readString();
                r103.A0Q = parcel2.readString();
                r103.A0R = parcel2.readString();
                Class<String> cls3 = String.class;
                r103.A0B = C165617ti.A0P(C146356vT.A00(), cls3, parcel2.readString(), "legalName");
                r103.A0O = parcel2.readString();
                r103.A0P = parcel2.readString();
                r103.A0A = C165617ti.A0P(C146356vT.A00(), cls3, parcel2.readString(), "legalName");
                r103.A05 = parcel2.readLong();
                r103.A0J = parcel2.readString();
                r103.A04 = parcel2.readLong();
                r103.A01 = parcel2.readInt();
                r103.A00 = parcel2.readInt();
                r103.A02 = parcel2.readInt();
                r103.A0V = parcel2.readString();
                r103.A0C = (C135086c7) C36411kG.A0H(parcel2, cls2);
                r103.A0K = parcel2.readString();
                r103.A0T = parcel2.readString();
                r103.A0M = parcel2.readString();
                r103.A0N = parcel2.readString();
                String readString13 = parcel2.readString();
                if (readString13 != null) {
                    r103.A0G = new C201599jw(readString13);
                }
                int readInt11 = parcel2.readInt();
                boolean z3 = false;
                if (readInt11 > 0) {
                    z = true;
                } else if (readInt11 == 0) {
                    z = false;
                } else {
                    z = null;
                }
                r103.A0I = z;
                String readString14 = parcel2.readString();
                if (readString14 != null) {
                    r103.A0H = new C207189uh(readString14);
                }
                String readString15 = parcel2.readString();
                if (readString15 != null) {
                    r103.A0F = new C198679e1(readString15);
                }
                r103.A0L = parcel2.readString();
                r103.A07 = (C135086c7) C36411kG.A0H(parcel2, cls2);
                if (parcel2.readInt() == 1) {
                    z3 = true;
                }
                r103.A0X = z3;
                r103.A08 = (C135086c7) C36411kG.A0H(parcel2, cls2);
                r103.A09 = (C135086c7) C36411kG.A0H(parcel2, cls2);
                r103.A0E = (C206339tC) C36411kG.A0H(parcel2, C206339tC.class);
                String readString16 = parcel2.readString();
                if (readString16 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(readString16);
                        arrayList = AnonymousClass001.A0I();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                arrayList.add(new C206519tX(C90474aD.A0e(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject)));
                            }
                        }
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiTransactionOfferData/fromJsonArray threw: ", e);
                        arrayList = null;
                    }
                    r103.A0W = arrayList;
                }
                r103.A06 = (C207119ua) C36411kG.A0H(parcel2, C207119ua.class);
                return r103;
            case 46:
                C175808b5 r104 = new C175808b5();
                Class<C135086c7> cls4 = C135086c7.class;
                r104.A01 = (C135086c7) C36411kG.A0H(parcel2, cls4);
                r104.A01 = parcel2.readString();
                r104.A00 = parcel2.readInt();
                r104.A02 = parcel2.readString();
                r104.A03 = parcel2.readString();
                r104.A03 = AnonymousClass000.A1O(parcel2.readInt());
                r104.A05 = parcel2.readString();
                r104.A06 = parcel2.readString();
                r104.A02 = (C135086c7) C36411kG.A0H(parcel2, cls4);
                r104.A00 = parcel2.readLong();
                return r104;
            case 47:
                AnonymousClass8b7 r105 = new AnonymousClass8b7();
                boolean z4 = false;
                r105.A0a = AnonymousClass000.A1S(parcel2.readByte(), 1);
                r105.A08 = (C135086c7) C36411kG.A0H(parcel2, C135086c7.class);
                r105.A0B = parcel2.readString();
                r105.A0A = parcel2.readString();
                r105.A0O = parcel2.readString();
                r105.A0Q = C165567td.A1Z(parcel2);
                r105.A03 = parcel2.readInt();
                r105.A0Y = C165567td.A1Z(parcel2);
                r105.A0U = C165567td.A1Z(parcel2);
                r105.A06 = parcel2.readLong();
                r105.A04 = parcel2.readInt();
                r105.A0G = parcel2.readString();
                r105.A0H = parcel2.readString();
                r105.A00 = parcel2.readInt();
                r105.A0W = C165567td.A1Z(parcel2);
                r105.A0V = C165567td.A1Z(parcel2);
                r105.A0S = C165567td.A1Z(parcel2);
                r105.A0R = C165567td.A1Z(parcel2);
                r105.A0J = parcel2.readString();
                r105.A05 = parcel2.readLong();
                r105.A01 = parcel2.readInt();
                r105.A06 = C165567td.A1Z(parcel2);
                if (parcel2.readByte() == 1) {
                    z4 = true;
                }
                r105.A07 = z4;
                r105.A02 = parcel2.readString();
                r105.A05 = parcel2.readString();
                r105.A00 = parcel2.readInt();
                r105.A03 = parcel2.readString();
                r105.A01 = parcel2.readInt();
                r105.A0C = parcel2.readString();
                r105.A0E = parcel2.readString();
                r105.A0D = parcel2.readString();
                r105.A09 = Long.valueOf(parcel2.readLong());
                r105.A04 = parcel2.readString();
                r105.A0F = parcel2.readString();
                r105.A0I = parcel2.readString();
                boolean z5 = false;
                r105.A0P = AnonymousClass000.A1S(parcel2.readByte(), 1);
                r105.A0Z = C165567td.A1Z(parcel2);
                r105.A0X = C165567td.A1Z(parcel2);
                if (parcel2.readByte() == 1) {
                    z5 = true;
                }
                r105.A0T = z5;
                r105.A0N = parcel2.readString();
                r105.A0M = parcel2.readString();
                r105.A0L = parcel2.readString();
                r105.A0K = parcel2.readString();
                return r105;
            case 48:
                return new C175688at(parcel2);
            default:
                String readString17 = parcel2.readString();
                String readString18 = parcel2.readString();
                String readString19 = parcel2.readString();
                int readInt12 = parcel2.readInt();
                HashMap A0J = AnonymousClass001.A0J();
                for (int i2 = 0; i2 < readInt12; i2++) {
                    String readString20 = parcel2.readString();
                    A0J.put(readString20, new C206859u7(readString20, parcel2.readString()));
                }
                return new C175738ay(readString17, readString18, readString19, A0J);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C207239um[i];
            case 1:
                return new C206529tY[i];
            case 2:
                return new AppLinkDeviceConnectionStatus[i];
            case 3:
                return new AppLinkDeviceHardwareState[i];
            case 4:
                return new AppLinkDevicePeakPowerState[i];
            case 5:
                return new C206809u0[i];
            case 6:
                return new AXf[i];
            case 7:
                return new C206429tO[i];
            case 8:
                return new C206449tQ[i];
            case 9:
                return new C206409tM[i];
            case 10:
                return new C206989uN[i];
            case 11:
                return new C206749tu[i];
            case 12:
                return new C166247vP[i];
            case 13:
                return new C166257vQ[i];
            case 14:
                return new AnonymousClass8VY[i];
            case 15:
                return new C207269up[i];
            case 16:
                return new C206759tv[i];
            case 17:
                return new C206949uI[i];
            case 18:
                return new C166297vU[i];
            case 19:
                return new C166267vR[i];
            case 20:
                return new C206469tS[i];
            case 21:
                return new C207109uZ[i];
            case 22:
                return new C166287vT[i];
            case 23:
                return new C175758b0[i];
            case 24:
                return new C175878bD[i];
            case 25:
                return new C175748az[i];
            case 26:
                return new C175798b4[i];
            case 27:
                return new C175728ax[i];
            case 28:
                return new C206829u4[i];
            case 29:
                return new C206859u7[i];
            case 30:
                return new C207159ue[i];
            case 31:
                return new C206869u8[i];
            case 32:
                return new C207139uc[i];
            case 33:
                return new C175768b1[i];
            case 34:
                return new C175788b3[i];
            case 35:
                return new C207119ua[i];
            case 36:
                return new C207259uo[i];
            case 37:
                return new C206289t2[i];
            case 38:
                return new C206329t8[i];
            case 39:
                return new C175778b2[i];
            case 40:
                return new C206889uA[i];
            case 41:
                return new C166277vS[i];
            case 42:
                return new C175698au[i];
            case 43:
                return new C175818b6[i];
            case 44:
                return new C207189uh[i];
            case 45:
                return new C175928bI[i];
            case 46:
                return new C175808b5[i];
            case 47:
                return new AnonymousClass8b7[i];
            case 48:
                return new C175688at[i];
            default:
                return new C175738ay[i];
        }
    }
}
