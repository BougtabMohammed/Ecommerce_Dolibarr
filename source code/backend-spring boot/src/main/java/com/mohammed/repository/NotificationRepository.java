package com.mohammed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohammed.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
