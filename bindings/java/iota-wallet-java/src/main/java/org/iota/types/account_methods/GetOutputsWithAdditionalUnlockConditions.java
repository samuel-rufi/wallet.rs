package org.iota.types.account_methods;

/// Get outputs with additional unlock conditions
public class GetOutputsWithAdditionalUnlockConditions implements AccountMethod {

    private OutputsToClaim outputsToClaim;

    public enum OutputsToClaim {
        None,
        MicroTransactions,
        NativeTokens,
        Nfts,
        All,
    }

    public GetOutputsWithAdditionalUnlockConditions withOutputsToClaim(OutputsToClaim outputsToClaim) {
        this.outputsToClaim = outputsToClaim;
        return this;
    }
}