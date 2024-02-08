package com.stefan.teammanagementapp.controller;

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
