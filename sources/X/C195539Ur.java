package X;

import android.os.Message;

/* renamed from: X.9Ur  reason: invalid class name and case insensitive filesystem */
public abstract class C195539Ur {
    public abstract void A07();

    public abstract void A08();

    public static C20958A0r A06(Object obj) {
        C20958A0r a0r = (C20958A0r) obj;
        AnonymousClass00C.A0D(a0r, 0);
        return a0r;
    }

    public boolean A09(Message message, Object obj) {
        AnonymousClass84B r3;
        AnonymousClass00S aif;
        if (this instanceof AnonymousClass8AB) {
            AnonymousClass8AB r1 = (AnonymousClass8AB) this;
            C20958A0r A06 = A06(obj);
            r3 = r1.A00;
            aif = new C22236Aix(A06, r1);
        } else if (this instanceof AnonymousClass8AE) {
            AnonymousClass8AE r12 = (AnonymousClass8AE) this;
            C20958A0r A062 = A06(obj);
            r3 = r12.A00;
            aif = new C22235Aiw(A062, r12);
        } else if (this instanceof AnonymousClass8A9) {
            AnonymousClass8A9 r13 = (AnonymousClass8A9) this;
            C20958A0r A063 = A06(obj);
            r3 = r13.A00;
            aif = new C22234Aiv(r13, A063);
        } else if (this instanceof AnonymousClass8AA) {
            AnonymousClass8AA r14 = (AnonymousClass8AA) this;
            C20958A0r A064 = A06(obj);
            r3 = r14.A00;
            aif = new C22233Aiu(r14, A064);
        } else if (this instanceof AnonymousClass8AF) {
            AnonymousClass8AF r15 = (AnonymousClass8AF) this;
            C20958A0r A065 = A06(obj);
            r3 = r15.A01;
            aif = new C22229Aiq(r15, A065);
        } else if (this instanceof AnonymousClass8AH) {
            AnonymousClass8AH r16 = (AnonymousClass8AH) this;
            C20958A0r A066 = A06(obj);
            r3 = r16.A00;
            aif = new C22226Ain(r16, A066);
        } else if (this instanceof AnonymousClass8AG) {
            AnonymousClass8AG r17 = (AnonymousClass8AG) this;
            C20958A0r A067 = A06(obj);
            r3 = r17.A00;
            aif = new C22224Ail(r17, A067);
        } else if (this instanceof AnonymousClass8AC) {
            AnonymousClass8AC r18 = (AnonymousClass8AC) this;
            C20958A0r A068 = A06(obj);
            r3 = r18.A00;
            aif = new C22221Aii(r18, A068);
        } else if (this instanceof AnonymousClass8AD) {
            AnonymousClass8AD r32 = (AnonymousClass8AD) this;
            C20958A0r a0r = (C20958A0r) obj;
            C36321k7.A0w(a0r, message);
            if (a0r instanceof AnonymousClass8AU) {
                r32.A02.A0C(new C22051Afy(r32));
                return true;
            } else if (a0r instanceof AnonymousClass8AL) {
                AnonymousClass9AO.A01.A01("sup:InitialStateDelegate", "[INITIAL]: Received ConnectionStepSuccess");
                C195999Xe r19 = ((AnonymousClass8AL) a0r).A00;
                AnonymousClass84B r2 = r32.A02;
                if (!AnonymousClass00C.A0J(r19, r2.A06())) {
                    return false;
                }
                r2.A0L.invoke(AnonymousClass89T.A00);
                r2.A00.A03 = AnonymousClass9QJ.A00(r2.A06, r2, AnonymousClass84B.A0S, 1);
                return true;
            } else if (a0r instanceof AnonymousClass8AQ) {
                AnonymousClass9AO.A01.A01("sup:InitialStateDelegate", "[INITIAL]: Received Connect Message");
                if (r32.A00 == null) {
                    r32.A02.A0C(new C22051Afy(r32));
                }
                C166097v1 r0 = r32.A02.A00;
                Message obtainMessage = r0.obtainMessage();
                obtainMessage.copyFrom(message);
                r0.A08.add(obtainMessage);
                return true;
            } else {
                AnonymousClass9AO.A01.A02("sup:InitialStateDelegate", AnonymousClass000.A0l(a0r, "[INITIAL]: Received invalid msg ", AnonymousClass000.A0u()));
                return true;
            }
        } else if (!(this instanceof AnonymousClass8A7)) {
            return false;
        } else {
            AnonymousClass8A7 r110 = (AnonymousClass8A7) this;
            C20958A0r A069 = A06(obj);
            r3 = r110.A00;
            aif = new C22218Aif(r110, A069);
        }
        return r3.A0D(aif);
    }
}
