import jnr.ffi.*;

public class FuseOperations extends Struct {
    public FuseOperations(Runtime runtime) {
        super(runtime);
    }

    public final Func<GetAttrCallback> getattr = func(GetAttrCallback.class);
}