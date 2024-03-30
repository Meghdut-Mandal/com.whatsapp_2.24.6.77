package X;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/* renamed from: X.72r  reason: invalid class name and case insensitive filesystem */
public class C1497672r implements Runnable {
    public final /* synthetic */ A0U A00;
    public final /* synthetic */ Path A01;

    public C1497672r(A0U a0u, Path path) {
        this.A00 = a0u;
        this.A01 = path;
    }

    public void run() {
        try {
            Files.delete(this.A01);
        } catch (IOException unused) {
        }
    }
}
