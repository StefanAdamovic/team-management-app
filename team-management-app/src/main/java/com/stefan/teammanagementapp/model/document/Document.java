package com.stefan.teammanagementapp.model.document;

import com.stefan.teammanagementapp.model.user.impl.UserImpl;

import java.time.Instant;

public interface Document {

    Long getId();

    void setId(Long id);

    String getFileType();

    void setFileType(String fileType);

    UserImpl getUploadedBy();

    void setUploadedBy(UserImpl uploadedBy);

    byte[] getFileContent();

    void setFileContent(byte[] fileContent);

    Instant getUploadedAt();

    void setUploadedAt(Instant uploadedAt);


}
