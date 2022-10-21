# Changelog

## \[2.0.4-rc.1]

- Add `sender`, `tag` and `issuer` fields to `NftOptions`.
  - [7b385587](https://github.com/iotaledger/wallet.rs/commit/7b38558789b335702eff3498540f56c96e498e74) Test on 2022-10-21

## \[2.0.4-rc.0]

- Add `sender`, `tag` and `issuer` fields to `NftOptions`.
  - [0e787c09](https://github.com/iotaledger/wallet.rs/commit/0e787c0954ee044a5f2d0ce0922b0a6b192ae98f) Test Push on 2022-10-21

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

<!-- ## Unreleased - YYYY-MM-DD

### Added

### Changed

### Deprecated

### Removed

### Fixed

### Security -->

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
