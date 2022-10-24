# Changelog

## \[1.0.0-rc.3]

- Breaking changes
  - [6fae860f](https://github.com/iotaledger/wallet.rs/commit/6fae860f377e322b5d90cfe82b5743e35a6be368) Breaking Java changes on 2022-10-24

## \[1.0.0-rc.2]

- Test release
  - [63ad2a71](https://github.com/iotaledger/wallet.rs/commit/63ad2a7193481cad49149f461f808403c2a617f4) Test on 2022-10-20

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
