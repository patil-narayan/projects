/*
 * @BulkTemplates.java@
 * Created on 01Feb2023
 *
 * Copyright (c) 2023 Infinite Computer Solutions
 *
 * All Right Reserved.
 * THIS IS UNPUBLISHED PROPRIETARY
 * SOURCE CODE OF Infinite Computer Solutions
 * The copyright notice above does not evidence any
 * actual or intended publication of such source code.
 */

package com.core.zyter.email.bulk.vos;

import java.util.ArrayList;
import java.util.List;

import com.core.zyter.email.bulk.entities.BulkTemplate;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class EmailBulkTemplates {

    List<BulkTemplate> bulkTemplates = new ArrayList<>();

    Long totalItems;
    Integer totalPages;
    Integer currentPage;
    Integer size;
}
