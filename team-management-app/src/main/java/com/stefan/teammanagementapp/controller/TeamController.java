package com.stefan.teammanagementapp.controller;

import com.stefan.teammanagementapp.model.team.impl.TeamRequest;
import com.stefan.teammanagementapp.model.team.impl.TeamResponse;
import com.stefan.teammanagementapp.model.user.impl.UserResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeamController {

    ResponseEntity<TeamResponse> createTeam(TeamRequest teamRequest);

    ResponseEntity<TeamResponse> getTeamById(Long teamId);

    ResponseEntity<TeamResponse> updateTeam(Long teamId, TeamRequest teamRequest);

    ResponseEntity<TeamResponse> deleteTeam(Long teamId);

    ResponseEntity<List<UserResponse>> getTeamMembers(Long teamId);

    ResponseEntity<UserResponse> addTeamMember(Long teamId, Long memberId);

    ResponseEntity<UserResponse> removeTeamMember(Long teamId, Long memberId);

    ResponseEntity<UserResponse> changeTeamLead(Long teamId, Long newTeamLeadId);

}
