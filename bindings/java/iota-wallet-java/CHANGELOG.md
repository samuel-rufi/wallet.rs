# Changelog

## \[1.0.0-rc.2]

- This is a breaking change
  - [138c2f40](https://github.com/iotaledger/wallet.rs/commit/138c2f406161c1543a9006c25641a3ae9dcc48b3) Java breaking change 1 on 2022-10-24

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
