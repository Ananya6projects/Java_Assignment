package com.xworkz.abstraction.external;
import com.xworkz.abstraction.internal.Icc;

public class BccIuser {
    private Icc icc;

    public BccIuser(Icc icc)
    {
        this.icc = icc;
        System.out.println("using icc arg in Bcci class");
    }
    public void execute()
    {
        System.out.println("running execute in Bcci");
        if(this.icc !=null) {
            this.icc.fairPlay();
        }
        else {
            System.err.println("connector is null");
}
}
}
