package com.stefan.teammanagementapp.model.preference.impl;


import com.stefan.teammanagementapp.model.preference.Language;
import com.stefan.teammanagementapp.model.preference.Preference;
import com.stefan.teammanagementapp.model.preference.Theme;
import com.stefan.teammanagementapp.model.user.impl.UserImpl;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "preference")
public class PreferenceImpl implements Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email_notification")
    private boolean emailNotification;


    private boolean appNotification;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private UserImpl user;


    @Enumerated(EnumType.STRING)
    @Column(name = "language", nullable = false)
    @NotNull(message = "Language cannot be null")
    private Language language;

    @Enumerated(EnumType.STRING)
    @Column(name = "theme", nullable = false)
    @NotNull(message = "Theme cannot be null")
    private Theme theme;


    // Todo proveriti zasto lombok i interface ne funkcionisu za ova 2 gettera
    @Override
    public boolean getEmailNotification() {
        return this.emailNotification;
    }

    @Override
    public boolean getAppNotification() {
        return this.appNotification;
    }

}
