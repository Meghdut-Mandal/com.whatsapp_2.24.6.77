package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class A2U implements C23115B5u {
    public boolean B2Q(C207229ul r2, File file) {
        return true;
    }

    public void BjG(C207229ul r1) {
    }

    public void BjH(int i, int i2, int i3, int i4) {
    }

    public void BjI(C207229ul r1) {
    }

    public void BjJ(C207229ul r1) {
    }

    public void BjK(C207229ul r1) {
    }

    public void BjL(C207229ul r1, int i) {
    }

    public void BjM(C207229ul r1) {
    }

    public void BjN(C207229ul r1, Throwable th) {
    }

    public void BjO(C207229ul r1) {
    }

    public void Bdo(C207229ul r15, int i) {
        AnonymousClass9VO r0 = ProvidersRegistry.A00;
        HashSet A16 = C36441kJ.A16();
        ArrayList arrayList = r0.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                if ((i2 & i) != 0) {
                    A16.add(next);
                }
                i2 <<= 1;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it2 = A16.iterator();
        while (it2.hasNext()) {
            String A0C = AnonymousClass001.A0C(it2);
            if (A0u.length() != 0) {
                A0u.append(",");
            }
            A0u.append(A0C);
        }
        Buffer buffer = r15.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8126514, 0, 0), "Active providers"), A0u.toString());
    }

    public void Bdn(C207229ul r14) {
        long nanoTime = System.nanoTime();
        Buffer buffer = r14.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0);
    }
}
