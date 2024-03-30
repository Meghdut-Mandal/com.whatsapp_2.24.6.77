package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: X.5Fa  reason: invalid class name and case insensitive filesystem */
public class C105535Fa extends C19580wB {
    public void A00() {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((C146936wP) A0s.next()).A00;
            chatTransferViewModel.A0Y.A02(8);
            chatTransferViewModel.A0X(4);
        }
    }

    public void A01() {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((C146936wP) A0s.next()).A00;
            if (!chatTransferViewModel.A06) {
                chatTransferViewModel.A0Y.A02(15);
            }
            chatTransferViewModel.A0X(5);
        }
    }

    public void A02(int i) {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ((C146936wP) A0s.next()).onError(i);
        }
    }

    public void A03(InputStream inputStream, OutputStream outputStream) {
        C159597jc r5;
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((C146936wP) A0s.next()).A00;
            InputStream inputStream2 = inputStream;
            OutputStream outputStream2 = outputStream;
            if (chatTransferViewModel.A06) {
                C18800tq r2 = chatTransferViewModel.A0J.A00.A00;
                C19970wo A0V = C36351kA.A0V(r2);
                C20810yC A0V2 = C36341k9.A0V(r2);
                C18830tt r3 = r2.A00;
                C1268465w r10 = (C1268465w) r2.A39.get();
                C105535Fa r13 = (C105535Fa) r3.A36.get();
                AnonymousClass6F6 r11 = (AnonymousClass6F6) r2.A3A.get();
                AnonymousClass6FO r9 = (AnonymousClass6FO) r2.A5N.get();
                r5 = new C147016wX(A0V, C36411kG.A0c(r2), A0V2, r9, r10, r11, (AnonymousClass6NX) r3.A1Y.get(), r13, (AnonymousClass6TQ) r3.A2b.get(), inputStream2, outputStream2);
            } else {
                C18800tq r22 = chatTransferViewModel.A0K.A00.A00;
                C19970wo A0V3 = C36351kA.A0V(r22);
                C20810yC A0V4 = C36341k9.A0V(r22);
                C18830tt r32 = r22.A00;
                C1275868w r112 = (C1275868w) r22.A44.get();
                C105535Fa r14 = (C105535Fa) r32.A36.get();
                C111145bo r16 = new C111145bo();
                C128596Cw r102 = (C128596Cw) r32.A1l.get();
                AnonymousClass6FO r12 = (AnonymousClass6FO) r22.A5N.get();
                r5 = new C147026wY((AnonymousClass179) r22.A3D.get(), A0V3, C36411kG.A0c(r22), A0V4, r102, r112, r12, (C125055zF) r32.A27.get(), r14, (AnonymousClass6TQ) r32.A2b.get(), r16, inputStream2, outputStream2);
            }
            chatTransferViewModel.A04 = r5;
            r5.run();
        }
    }
}
