package com.pawel.fuse.example;

public interface ClaimService {

    public ClaimOutput apply(ClaimInput input);

    public ClaimStatus cancel(String claimNo);

}
