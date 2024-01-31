package com.stefan.teammanagementapp.model.document;

import com.stefan.teammanagementapp.model.user.User;

public interface Document {

    Long getId();

    void setId(Long id);

    String getFileType();

    void setFileType(String FileType);

    User getUploadedBy();

    void setUploadedBy(User uploadedBy);

    byte[] getFileContent();

    void setFileContent(byte[] fileContent);


}
