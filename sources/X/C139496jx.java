package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import com.facebook.stash.core.FileStash;
import java.io.File;

/* renamed from: X.6jx  reason: invalid class name and case insensitive filesystem */
public class C139496jx implements C160587lF {
    public final C157727ea A00;

    public static String A00(AnonymousClass6VA r3) {
        ARAssetType aRAssetType = r3.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal != 1) {
            if (!(ordinal == 0 || ordinal == 3 || ordinal == 2 || ordinal == 4)) {
                throw C90464aC.A0P(aRAssetType, "Got unexpected metadata type: ", AnonymousClass000.A0u());
            }
        } else if (r3.A09 == null) {
            return r3.A0A;
        }
        return r3.A09;
    }

    public File B99(AnonymousClass6VA r3, StorageCallback storageCallback) {
        C139516jz r0 = (C139516jz) this.A00;
        String A002 = A00(r3);
        if (A002 == null) {
            return null;
        }
        return r0.A02.getFile(A002);
    }

    public boolean BLG(AnonymousClass6VA r3, boolean z) {
        C139516jz r0 = (C139516jz) this.A00;
        String A002 = A00(r3);
        if (A002 == null || !r0.A02.BJu(A002)) {
            return false;
        }
        return true;
    }

    public void Bnc(AnonymousClass6VA r3) {
        C139516jz r1 = (C139516jz) this.A00;
        if (A00(r3) != null) {
            r1.A02.Bnd(A00(r3));
        }
    }

    public File BpG(AnonymousClass6VA r7, StorageCallback storageCallback, File file) {
        C139516jz r0 = (C139516jz) this.A00;
        String A002 = A00(r7);
        if (A002 != null) {
            FileStash fileStash = r0.A02;
            File filePath = fileStash.getFilePath(A002);
            if (!AnonymousClass6GT.A01(filePath)) {
                filePath = fileStash.insertFile(A002);
                if (!file.renameTo(filePath)) {
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1N(file, filePath, A0M);
                    AnonymousClass6YR.A0F("StashDiskCacheWrapper", "Failed renaming file from %s to %s", A0M);
                    fileStash.Bnd(A002);
                }
            }
            return filePath;
        }
        return null;
    }

    public void Bx4(AnonymousClass6VA r3) {
        C139516jz r0 = (C139516jz) this.A00;
        String A002 = A00(r3);
        if (A002 != null) {
            r0.A02.getFile(A002);
        }
    }

    public C139496jx(C157727ea r2) {
        if (r2 != null) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass001.A09("Must provide a disk cache wrapper");
    }
}
