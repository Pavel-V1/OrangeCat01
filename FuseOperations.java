import jnr.ffi.*;
import jnr.ffi.Runtime;

public class FuseOperations extends Struct {
    public FuseOperations(Runtime runtime) {
        super(runtime);
    }

    //public final Func<GetAttrCallback> getattr = func(GetAttrCallback.class);
    public final Function<GetAttrCallback> getattr = function(GetAttrCallback.class);
}