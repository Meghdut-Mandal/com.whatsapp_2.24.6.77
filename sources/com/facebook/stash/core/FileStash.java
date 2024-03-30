package com.facebook.stash.core;

import X.C160847lg;
import java.io.File;

public interface FileStash extends C160847lg {
    File getFile(String str);

    File getFilePath(String str);

    File insertFile(String str);
}
