package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

public interface StandardIntegrityManager {

    public abstract class PrepareIntegrityTokenRequest {

        public abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        public abstract int a();

        public abstract long b();

        public static Builder builder() {
            c cVar = new c();
            cVar.a(0);
            return cVar;
        }
    }

    public abstract class StandardIntegrityToken {
        public abstract Task showDialog(Activity activity, int i);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public abstract class StandardIntegrityTokenRequest {

        public abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new f();
        }

        public abstract String a();
    }

    Task prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
