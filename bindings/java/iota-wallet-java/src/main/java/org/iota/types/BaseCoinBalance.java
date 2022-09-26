// Copyright 2022 IOTA Stiftung
// SPDX-License-Identifier: Apache-2.0

package org.iota.types;
public class BaseCoinBalance extends AbstractObject {
    /// Total amount
    private String total;
    /// Balance that can currently be spent
    private String available;

    public String getTotal() {
        return total;
    }

    public String getAvailable() {
        return available;
    }
}