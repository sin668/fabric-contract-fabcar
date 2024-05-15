/*
 * SPDX-License-Identifier: Apache-2.0
 */

package dev.snowdrop.example;

import org.hyperledger.fabric.contract.annotation.DataType;
import org.hyperledger.fabric.contract.annotation.Property;

import com.owlike.genson.annotation.JsonProperty;

/**
 * CarQueryResult structure used for handling result of query
 *
 */
@DataType()
public final class CarHistoryResult {
    @Property()
    private final String txId;

    @Property()
    private final String timestamp;

    @Property()
    private final boolean isDeleted;

    @Property()
    private final Car record;

    public CarHistoryResult(@JsonProperty("TxId") final String txId, @JsonProperty("Timestamp") final String timestamp,
            @JsonProperty("IsDeleted") final boolean isDeleted, @JsonProperty("Record") final Car record) {
        this.txId = txId;
        this.timestamp = timestamp;
        this.isDeleted = isDeleted;
        this.record = record;
    }

    public String getTxId() {
        return txId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public Car getRecord() {
        return record;
    }

}