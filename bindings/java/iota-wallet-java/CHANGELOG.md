# Changelog

## \[1.0.1-rc.1]

- Adjust license once more
  - [900903f3](https://github.com/iotaledger/wallet.rs/commit/900903f38cd52d1ba1275b56e8687ea98a490e60) Adjust license once more on 2022-10-21

## \[1.0.1-rc.0]

- Fix abc.
  - [c1a61fd0](https://github.com/iotaledger/wallet.rs/commit/c1a61fd0e058d2b8bb6f18da35081f962817c175) XYZ on 2022-10-21
  - [d2da37f6](https://github.com/iotaledger/wallet.rs/commit/d2da37f64ad01e06906df37f90a80053536e724c) XYZ on 2022-10-21
  - [914e8e77](https://github.com/iotaledger/wallet.rs/commit/914e8e7781be81ce407424cf6699937a31e2f34a) ABC on 2022-10-21
  - [00f09326](https://github.com/iotaledger/wallet.rs/commit/00f09326019a4f0a42cf41604f92ad40a0c9517a) ABC on 2022-10-21

## 1.0.0-rc.1 - 2022-10-06

### Added

- `Wallet` APIs:
  - `createAccount`;
  - `getAccount`;
  - `getAccounts`;
  - `backup`;
  - `changeStrongholdPassword`;
  - `clearStrongholdPassword`;
  - `isStrongholdPasswordAvailable`;
  - `recoverAccounts`;
  - `restoreBackup`;
  - `removeLatestAccount`;
  - `generateMnemonic`;
  - `verifyMnemonic`;
  - `setClientOptions`;
  - `getLedgerNanoStatus`;
  - `getNodeInfo`;
  - `setStrongholdPassword`;
  - `setStrongholdPasswordClearInterval`;
  - `storeMnemonic`;
  - `startBackgroundSync`;
  - `stopBackgroundSync`;
  - `emitTestEvent`;
  - `bech32ToHex`;
  - `hexToBech32`;

- `AccountHandle` APIs:
  - `buildAliasOutput`;
  - `buildBasicOutput`;
  - `buildFoundryOutput`;
  - `buildNftOutput`;
  - `burnNativeToken`;
  - `burnNft`;
  - `consolidateOutputs`;
  - `destroyAlias`;
  - `destroyFoundry`;
  - `generateAddresses`;
  - `getOutput`;
  - `getFoundryOutput`;
  - `getOutputsWithAdditionalUnlockConditions`;
  - `getTransaction`;
  - `getIncomingTransactionData`;
  - `outputs`;
  - `unspentOutputs`;
  - `decreaseNativeTokenSupply`;
  - `minimumRequiredStorageDeposit`;
  - `mintNativeToken`;
  - `mintNfts`;
  - `prepareOutput`;
  - `prepareTransaction`;
  - `prepareSendAmount`;
  - `syncAccount`;
  - `sendAmount`;
  - `sendMicroTransaction`;
  - `sendNativeTokens`;
  - `sendNft`;
  - `setAlias`;
  - `sendOutputs`;
  - `signTransactionEssence`;
  - `submitAndStoreTransaction`;
  - `claimOutputs`;
  - `createAliasOutput`;

- Examples:
  - `Backup`;
  - `BurnNativeToken`
  - `BurnNft`;
  - `CheckBalance`;
  - `ClaimOutputs`;
  - `CreateAccount`;
  - `CreateAliasOutput`;
  - `DestroyAliasOutput`;
  - `DestroyFoundry`;
  - `GenerateAddress`;
  - `GetAccountByAlias`;
  - `GetAccountByIndex`;
  - `GetAccounts`;
  - `ListOutputs`;
  - `ListTransactions`;
  - `MeltNativeToken`;
  - `MintNativeToken`;
  - `MintNft`;
  - `RecoverAccounts`;
  - `SendAmount`;
  - `SendMicroTransaction`;
  - `SendNativeToken`;
  - `SendNft`;
  - `SyncAccount`;

### Changed

- Rust interaction through a JSON passing approach;

### Removed

- All glue code;
